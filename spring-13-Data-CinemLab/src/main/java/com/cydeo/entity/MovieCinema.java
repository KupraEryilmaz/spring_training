package com.cydeo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class MovieCinema extends BaseEntity{


    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;//sadece movie bilgisini almak istiyorum.Fakat spring boot arka planda iki islem yapacak tum movieleri yukleyecek ayni zamanda cinema bilgilerine ihtiyacim olmasa bile  da cinemalari yukleyecek.fetch kodu iki ture sahip. FetchType.LAZY kodunu field uzerine yazdigimiz zaman su anlami vermis oluyoruz.Bu field i sadece ihtiyacim oldugu zaman yukle aksi taktirde yukleme. Ikinci tur olan FetchType.EAGER kodunu field uzerine yazdigimiz zaman ise siniftan baska bir field i yuklemek istedigim zaman dahi ihtiyacim olmasada  eager kodunu yazdigim field i yukle.Lazy yazmadigimiz taktirde yalnizca bir field i yuklemek istedigimizde siniftaki butun dosyalar arka planda yukleniyor.Uygulamamizin performasini etkileyen bir durum.
    @ManyToOne(fetch = FetchType.LAZY)
    private Cinema cinema;

    @Override
    public String toString() {
        return "MovieCinema{" +
                "dateTime=" + dateTime +
                '}';
    }
}
