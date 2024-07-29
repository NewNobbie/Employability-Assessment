package com.riwi.final_assessment.infrastructure.abstract_service;

import com.riwi.final_assessment.api.dto.request.ProductRequest;
import com.riwi.final_assessment.api.dto.response.ProductResponse;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Create;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Delete;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.ReadById;
import com.riwi.final_assessment.infrastructure.abstract_service.Crud.Update;

public interface IProductService extends Create<ProductRequest,
 ProductResponse>, ReadById<ProductResponse,
  Long>,Update<ProductRequest,ProductResponse,Long>, 
  Delete<Long>{

    
}