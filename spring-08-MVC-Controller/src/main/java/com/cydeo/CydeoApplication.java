package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;

//bilgisayarimiz bir cok porta sahip ve bilgisayarimiza indirdigimiz programlar belirli portlarda calisir."Tom started on port(s) 8080 "uygulamamiz port 8080 den disari aciliyor demek.Browser a  localhost:8080 yazdigimda browser im ve intelijey im birbiri ile baglanti kurar. localhost bizim hala bir domaine sahip olmadigimizi soyler.Yani bizim uygulamamiz hala canli degil. yani uygulamamiz local olarak bizim bilgisayarimizda calisiyor.Bu sayfadaki kodumuzu calistiriyoruz. Daha sonrasindalocalhost:8080 yazdigimizda karsimiza cikan sayfa bizim server imizin calistigini gosterir.Kodumuzu durdurursak ve tekrar localhost:8080 sayfasina gidersek sayfaya ulasilamadigini goruruz.Yani server calismayi durduruyor.8080 nereden geliyor peki default olarak autoconfigurationdan geliyor.Hatirliyorsan spring boot bizim programimiz icin gerekli olacak objeleri olusturuyordu.Bu da onlardan biri
@SpringBootApplication
//@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class CydeoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CydeoApplication.class, args);
    }

}
