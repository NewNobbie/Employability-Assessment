package com.riwi.final_assessment.infrastructure.abstract_service.Crud;

public interface ReadById<RS,ID> {
    RS findById(ID id);
}