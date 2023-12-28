package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  name;
    private String surName;
    private String userName;
    private String address;
    private String email;

    public Customer(String name, String surName, String userName, String address, String email) {
        this.name = name;
        this.surName = surName;
        this.userName = userName;
        this.address = address;
        this.email = email;
    }
}
