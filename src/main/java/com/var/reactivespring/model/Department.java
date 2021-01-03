package com.var.reactivespring.model;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("department")
public class Department {
    @Id
    private Integer id;
    private String name;
    @Column("user_id")
    private Integer userId;
    private String loc;
}