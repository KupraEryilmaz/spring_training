package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Data
public class Employee extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "department")//bu kodu yazmazsak hata verir cunku tabloda department yazmazsak department_id olur.
    private Department department;
    @ManyToOne
    //@JoinColumn(name = "region_id") bu kodu yazmasakta region_id oluyor zaten.Biz sinifta @Table annotationu ile table a yeni bir isim tanimlasak dahi spring foreign key ismini otomatik olarak sinifismi_id olarak olusturuyor.
    private Region region;


}
