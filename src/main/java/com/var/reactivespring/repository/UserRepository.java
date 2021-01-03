package com.var.reactivespring.repository;

import com.var.reactivespring.model.*;
import org.springframework.data.r2dbc.repository.*;
import org.springframework.data.repository.reactive.*;
import reactor.core.publisher.*;

public interface UserRepository extends ReactiveCrudRepository<User,Integer> {
    @Query("select * from users where age >= $1")
    Flux<User> findByAge(int age);
}