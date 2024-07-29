package com.riwi.final_assessment.infrastructure.abstract_service;

public interface Create<RQ,RS> {
    RS create(RQ rq);
}
