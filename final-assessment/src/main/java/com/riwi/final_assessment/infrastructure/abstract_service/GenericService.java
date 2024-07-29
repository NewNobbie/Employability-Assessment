package com.riwi.final_assessment.infrastructure.abstract_service;

public interface GenericService<RequestDTO, ResponseDTO, ID> {

    ResponseDTO create(RequestDTO request);

    ResponseDTO read(ID id);

    ResponseDTO update(ID id, RequestDTO request);

    void delete(ID id);

}
