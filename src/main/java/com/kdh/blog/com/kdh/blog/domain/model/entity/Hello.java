package com.kdh.blog.com.kdh.blog.domain.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hello {

    @Id
    @GeneratedValue
    int id;

    String name;
}
