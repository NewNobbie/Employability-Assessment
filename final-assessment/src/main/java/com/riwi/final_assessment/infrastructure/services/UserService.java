package com.riwi.final_assessment.infrastructure.services;

import com.riwi.final_assessment.api.dto.request.UserBasicRequest;

import com.riwi.final_assessment.api.dto.request.UserCompleteRequest;
import com.riwi.final_assessment.api.dto.response.UserBasicResponse;
import com.riwi.final_assessment.domain.entities.User;
import com.riwi.final_assessment.domain.repositories.UserRepository;
import com.riwi.final_assessment.infrastructure.abstract_service.IUserService;
import com.riwi.final_assessment.utils.exceptions.BadRequestException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    @Transactional(readOnly = true)
    public UserBasicResponse findById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.map(user -> modelMapper.map(user, UserBasicResponse.class))
                .orElseThrow(() -> new BadRequestException("User not found with id " + id));
    }

    @Override
    @Transactional
    public void delete(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("User not found with id " + id));
        userRepository.delete(user);
    }

    @Override
    @Transactional
    public UserBasicResponse update(UserBasicRequest userBasicRequest, Long id) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("User not found with id " + id));
        modelMapper.map(userBasicRequest, existingUser);
        User updatedUser = userRepository.save(existingUser);
        return modelMapper.map(updatedUser, UserBasicResponse.class);
    }

    @Override
    @Transactional
    public UserBasicResponse create(UserCompleteRequest userCompleteRequest) {
        User user = modelMapper.map(userCompleteRequest, User.class);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserBasicResponse.class);
    }
}
