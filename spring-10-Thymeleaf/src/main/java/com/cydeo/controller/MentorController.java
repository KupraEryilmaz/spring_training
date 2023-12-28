package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {


    @GetMapping("/register")
    public String register(Model model){
        List<String> batchList = Arrays.asList("JD1","JD2","JD3");
        model.addAttribute("batchList", batchList);
        model.addAttribute("mentor", new Mentor());
        return "mentor/mentor-register";
    }
//    @PostMapping("/confirm")
//    public String submitForm(@ModelAttribute("mentor") Mentor mentor){
//
//        return "mentor/mentor-register";
//
//    }
// register end point sayfasinda register butonuna bastiktan sonra sayfa aksiyon olarak bizi bu methoda yonlendirecek.Bu method bize nasil bir sayfa verir?End point i confirm olan ve dolu bir form verir.Neden dolu bir sayfa verir?Cunku register end point in yonlendirdigi mentor-register.htm inde kullanici tarafindan olusturulan mentor objesi var.Yani suan bos obje mevcut degil.Fakat biz register butonuna bastigimizda bos bir form almak istiyoruz.

//    @PostMapping("/confirm")
//    public String submitForm(@ModelAttribute("mentor") Mentor mentor, Model model){
//        model.addAttribute("batchList", batchList);
//        model.addAttribute("mentor",new Mentor());
//
//        return "mentor/mentor-register";
//
//    }
// register end point sayfasinda register butonuna bastiktan sonra sayfa aksiyon olarak bizi bu methoda yonlendirecek.Bu method bize nasil bir sayfa verir?End point i confirm olan ve bos bir form verir.Fakat biz end pointimizin confirm degil register olmasini istiyoruz.Bunun icin ne yapmaliyiz?Redirect methodunu kullanmaliyiz.Bu method ile view i degil end point methodunu aliyoruz.

    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute("mentor") Mentor mentor){

        return "redirect:/mentor/register";
    }
    @GetMapping("/confirm")
    public String submitForm2(){
        return "mentor/mentor-confirmation";

    }

}
