package com.cydeo.entity;


import com.cydeo.enums.Gender;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "students")//table name ni degistirmemizi saglayan annotation
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentFirstName")//sutunun ozelliklerini tanimlamamizi saglar.
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
//    @Enumerated(EnumType.ORDINAL)//Gender i integer olarak kaydeder.Hic bir annotation koymasak dahi integer olarak kaydeddigi icin bu annotationu koymasakda olur.
    private Gender gender;

    @Transient//tabloda gormek istemedigimiz fiel in basina ekledigimiz annotation.
    private String city;


}
