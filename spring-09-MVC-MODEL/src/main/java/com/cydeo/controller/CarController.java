package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    //temel olarak browserdan bilgiyi aliyoruz uygulamamiza getiriyoruz
    @RequestMapping("/info")//browserda localhost:8080/info seklinde arama yaparsak browser hata verir cunku bu end point query parameter ile calisiyor
    public String carInfo(@RequestParam String make, Model model){ // @RequestParam query parameter ile calisiyor

        model.addAttribute("brand",make);

        return"car/car-info";
    }
    //localhost:8080/info2 (KIA)
    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(required = false,defaultValue = "KIA") String make, Model model){

        model.addAttribute("brand",make);

        return "car/car-info";
    }


    //localhost:8080/info3?make=Honda&year=2015
    @RequestMapping("/info3")
    public String carInfo3(@RequestParam String make,@RequestParam int year, Model model){

        model.addAttribute("brand",make);
        model.addAttribute("age",year);

        return "car/car-info";
    }


//    //localhost:8080/info/honda/2015
//    @RequestMapping("/info/{make}/{year}")//
//    public String getCarInfo(@PathVariable String make, @PathVariable int year){
//
//        System.out.println(make);
//        System.out.println(year);
//
//        return "car/car-info";
//    }

    @RequestMapping("/info/{make}/{year}")//
    public String getCarInfo2(@PathVariable String make, @PathVariable int year,Model model){

        model.addAttribute("brand",make);
        model.addAttribute("age",year);

        return "car/car-info";
    }





}
