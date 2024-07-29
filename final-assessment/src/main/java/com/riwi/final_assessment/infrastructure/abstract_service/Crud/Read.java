package com.riwi.final_assessment.infrastructure.abstract_service.Crud;

import org.springframework.data.domain.Page;

public interface Read<RS> {
    Page<RS> getAll(int page, int size);
}