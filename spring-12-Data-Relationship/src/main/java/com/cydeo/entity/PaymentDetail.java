package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "payment_details")
public class PaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal merchantPayoutAmount;
    private BigDecimal commissionAmount;
    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;
    @OneToOne(mappedBy = "paymentDetail") //bu field i eklemesekte olurdu fakat ozzy mappedby konusunu anlatmak icin ekledi.Payment ve payment detail de Uni direction bizim icin yeterli.mappedby eklemesek payment detail icinde foreign key olusturulacak.Fakat iki tablo join oldugunda tak bir foreign key olmali.
    private Payment payment;

    public PaymentDetail(BigDecimal merchantPayoutAmount, BigDecimal commissionAmount, LocalDate payoutDate) {
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.commissionAmount = commissionAmount;
        this.payoutDate = payoutDate;
    }
}
