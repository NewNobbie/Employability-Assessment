package com.riwi.final_assessment.infrastructure.abstract_service;

public interface Update<RQ, RS, ID> {
    RS update(RQ rq, ID id);
}
