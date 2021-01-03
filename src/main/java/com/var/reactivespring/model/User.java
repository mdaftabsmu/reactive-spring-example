package com.var.reactivespring.model;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("users")
public class User {

    @Id
    private Integer id;
    private String name;
    private int age;
    private double salary;
}