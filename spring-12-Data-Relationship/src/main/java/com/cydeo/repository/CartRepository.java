package com.cydeo.repository;

import com.cydeo.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
//Ticketing apllicationda service implementationda @Service annotationu kullanmistik.Cunku service impl diger siniflarda obje olarak kullaniliyordu.Repository de bir nevi database in service si ve aslinda @Repository annotationu kullanabiliriz.Fakat springin bir versiyonundan sonra kullanmasakda oluyor.Ustelik @service annotationu u class level de kullanmistik burada neden interface level de kullaniyoruz.Cunku sprin repository interfacesini calistirdigi zaman arka planda impl. class ini otomatik olarak kendi olusturuyor.Biz yalnizca JpaRepository i extend ediyoruz.Gerisini spring hallediyor.Ustelik JpaRepository neden class a degilde interfaceye extend ediyoruz.Cunku JpaRepository zaten ihtiyacimiz olan reposiyory e sahip class a extend edersek override edip sql kodu yazmamiz gerekecek.Interfaceye extend edince override etmeye gerek kalmadan mevcut methodlari ve implementationlari kullanabiliyoruz.
public interface CartRepository extends JpaRepository<Cart,Long> {
}
