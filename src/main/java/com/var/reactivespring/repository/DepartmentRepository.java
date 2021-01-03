package com.var.reactivespring.repository;

import com.var.reactivespring.model.*;
import org.springframework.data.repository.reactive.*;
import reactor.core.publisher.*;

public interface DepartmentRepository extends ReactiveCrudRepository<Department,Integer> {
    Mono<Department> findByUserId(Integer userId);
}