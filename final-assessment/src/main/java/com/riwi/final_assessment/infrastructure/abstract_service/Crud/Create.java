package com.riwi.final_assessment.infrastructure.abstract_service.Crud;

public interface Create<RQ,RS> {
    RS create(RQ rq);
}
