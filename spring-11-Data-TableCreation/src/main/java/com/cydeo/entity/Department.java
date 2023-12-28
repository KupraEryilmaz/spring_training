package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor//bu annotation parent sinifindan gelen field lari eklemedigi icin kullanabiliriz.Manuel olarak constructor eklememize gerek kalmiyor.
public class Department extends BaseEntity{

    private String department;
    private String division;
}
