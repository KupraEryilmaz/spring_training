package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor//repository e sahip siniflar bu annotationu kullanamzsa program hata verir.
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id yi bizim yerimize spring otomatik olarak olusturuyor.
    private Long id;
    private String make;
    private String model;

    public Car(String make, String model) { //AllArgsConstructors annotation u eklemiyoruz.Cunku id sprin tarafindan saglaniyor.O nedenle manuel constructor ekliyoruz.
        this.make = make;
        this.model = model;
    }
}
