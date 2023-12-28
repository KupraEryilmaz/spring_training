package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity{

    private String first_name;
    private String last_name;
    private String email;
    @Column(columnDefinition = "DATE")//LocalDate tipini LocalDate tipi olarak kaydedebilmeyi saglar.Aksi taktirde varchar olur
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)//Gender i string olarak kaydetmemizi saglar aksi halde integer olarak kaydeder.Degerler 1,2 seklinde gelir.
    private Gender gender;
    private int salary;

}
