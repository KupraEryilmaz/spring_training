package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
@RequestMapping("/student")
    public String getStudentInfo(){
        return "student/welcome.html"; //sadece welcome.html yazdigimiz zaman alti sari cizgi oldu sebebi welcome.html dosyasinin direk static dosyasinin altinda olmamasi.Bu nedenle student/ basina bagli bulundugu folder i yazdik
    }
}
