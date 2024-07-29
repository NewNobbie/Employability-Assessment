package com.riwi.final_assessment.infrastructure.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.riwi.final_assessment.api.dto.request.ProductRequest;
import com.riwi.final_assessment.api.dto.response.ProductResponse;
import com.riwi.final_assessment.domain.entities.Product;
import com.riwi.final_assessment.domain.repositories.ProductRepository;
import com.riwi.final_assessment.infrastructure.abstract_service.IProductService;
import com.riwi.final_assessment.utils.exceptions.BadRequestException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional
    public ProductResponse create(ProductRequest productRequest) {

        Product product = modelMapper.map(productRequest, Product.class);
        Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductResponse.class);
    }


    @Override
    @Transactional(readOnly = true)
    public ProductResponse findById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.map(product -> modelMapper.map(product, ProductResponse.class))
                .orElseThrow(() -> new BadRequestException("User not found with id " + id));
    }



    @Override
    @Transactional
    public ProductResponse update(ProductRequest productRequest, Long id) {

        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("User not found with id " + id));
        modelMapper.map(productRequest, existingProduct);
        Product updatedProduct = productRepository.save(existingProduct);
        return modelMapper.map(updatedProduct, ProductResponse.class);
    }

    

    @Override
    @Transactional
    public void delete(Long id) {
        Product product = productRepository.findById(id)
        .orElseThrow(() -> new BadRequestException("User not found with id " + id));
        productRepository.delete(product);

        
    }

    
    
}
