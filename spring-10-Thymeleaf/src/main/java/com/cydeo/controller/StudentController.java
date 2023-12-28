package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
  //  @RequestMapping(value = "/register",method = RequestMethod.GET)
    @GetMapping("/register") //14.satir ile ayni islevi yapiyor
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }

    @RequestMapping("/welcome")
    public String welcome(@RequestParam int id){
        System.out.println(id);
        return "student/welcome";
    }


   // @RequestMapping(value = "/welcome",method = RequestMethod.POST)
    @PostMapping("/welcome") //26. satir ile ayni islevi yapiyor.
    public String welcome(@RequestParam String name){
        System.out.println(name);
        return "student/welcome";
    }

    //pom.xml de devtoll dependency nin islevi: server i yeniden baslatmadan sadece yeniden uygulamayi baslatarak degisiklikleri browserda gormemize olanak tanir.Server i yeniden baslatmak 3 sn suruyorsa uygulamayi yeniden insa etmek 5 mili saniye suruyor.Zamandan tasarruf etmeyi sagliyor.
}
