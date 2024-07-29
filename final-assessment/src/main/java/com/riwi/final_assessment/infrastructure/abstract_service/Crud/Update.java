package com.riwi.final_assessment.infrastructure.abstract_service.Crud;

public interface Update<RQ, RS, ID> {
    RS update(RQ rq, ID id);
}
