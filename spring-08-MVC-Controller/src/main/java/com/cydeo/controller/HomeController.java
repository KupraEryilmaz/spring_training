package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Component de iceriyor icinde yani spring ayni zamanda obje olusturup yonetecek Controller ozelligi ile de handle mapper icine kaydedecegiz
public class HomeController {
    //method ismi onemli degil cunku bizim yapimiz contoller ve end point ile calisiyor

    @RequestMapping("/home")
    public String getHomePage(){//method ismi handle mapper da kayit ederken kullaniliyor
       return "home.html";

    }

    @RequestMapping({"/apple", "/orange"})//farkli end point ayni sayfayi paylasabilir
    public String getHomePage1(){
        return "home.html";
    }
    @RequestMapping // nothing and / default sayfayi verir
    public String getHomePage2(){
        return "home.html";
    }

    @RequestMapping("/ozzy")
    public String getHomePage3(){
        return "home.html";

    }
}
