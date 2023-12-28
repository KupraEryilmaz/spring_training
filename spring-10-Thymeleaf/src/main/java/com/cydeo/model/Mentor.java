package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//uygulamamizda yeni bir mentor kaydetmek istedigimizde yeni bir mentor objesi olusturmaliyiz.Bu nedenle mentor sinifina ihtiyacimiz var.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mentor {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String batch;
    private boolean graduated;
    private String company;
}
