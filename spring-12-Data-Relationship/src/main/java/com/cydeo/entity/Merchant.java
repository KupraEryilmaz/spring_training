package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "merchants")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private BigDecimal transactionFree;
    private BigDecimal commissionRate;
    private int payoutDelayCount;

  // @OneToMany(mappedBy = "merchant")// mappedBy annotationunu koymazsam 1 merchantin sahip oldugu payment id lerini
   //gosteren 3. bir tablo olusturulacak.Bunu istemiyoruz.table lar arasinda iliskiyi gosteren @OneToMany gibi annotationlar her zaman many olan tarafinda olusturulmali.Bu annotation ve bu field a ihtiyacimiz yok.Merchant ve payment arasinda uni direction yeter.Annotation u da many olan kisma yani payment sinifina koyacagiz.
   // private List<Payment> payment;  Bir merchant birden cok payment e sahip olabilecegi izin List kullandik.


    public Merchant(String name, String code, BigDecimal transactionFree, BigDecimal commissionRate, int payoutDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFree = transactionFree;
        this.commissionRate = commissionRate;
        this.payoutDelayCount = payoutDelayCount;
    }
}
