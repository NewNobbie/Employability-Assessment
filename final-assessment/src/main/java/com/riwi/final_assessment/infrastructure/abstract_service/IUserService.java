package com.riwi.final_assessment.infrastructure.abstract_service;

import com.riwi.final_assessment.api.dto.request.UserBasicRequest;
import com.riwi.final_assessment.api.dto.request.UserCompleteRequest;
import com.riwi.final_assessment.api.dto.response.UserBasicResponse;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Create;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Delete;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.ReadById;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Update;
import org.springframework.transaction.annotation.Transactional;

public interface IUserService extends Create<UserCompleteRequest, UserBasicResponse>,
        ReadById<UserBasicResponse, Long>,
        Update<UserBasicRequest, UserBasicResponse, Long>, Delete<Long> {
}
