package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private Status paymentStatus;

//    @OneToOne(cascade = CascadeType.ALL)
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})//payment detail repository e ihtiyacimiz yok. one to one iliskisine sahip table larda cascade kodunu kullanabiliriz.Anlami belirttigimiz islemleri paymentte gerceklestirdigimiz zaman payment detailde de gerceklestir demek.All dersek butun islemler olur.Mesela Persist dersek sadece kaydetme islemini ayni anda yapar.Cascade aslinda cok tercih edilen bir kod degil.Konuyu anlamak icin kullandik.bu kodu kullanmak yerine payment detail repository si olusturabilirdik.

    @JoinColumn(name = "payment_detail_id")//bunu yazmasakta zaten payment_detail_id olarak gelecek kodu gosterme amacli yaptik
    private PaymentDetail paymentDetail;
    @ManyToOne
    private Merchant merchant;
    @ManyToOne
    private Customer customer;
    @OneToOne
    private Cart cart;

    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
