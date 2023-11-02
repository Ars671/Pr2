package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class HomeController {

    @GetMapping("/home")
    String home() {return "home";}

    @PostMapping("/home")
    String toPrintText(Model model, @RequestParam(value = "NamePrint", required = false, defaultValue = "") String name) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/calc")
    String calc() {
        return "calc";
    }

    @PostMapping("/calc")
    String calc(Model model, @RequestParam(value = "example") String name,@RequestParam(value = "NamePrint3")double name1,@RequestParam(value = "NamePrint4")double name2) {

        Double muc;
        if(name.equals("+")){
            muc = name1 + name2;
            model.addAttribute("name", muc);
        }
        else if (name.equals("-")){
            muc = name1 - name2;
            model.addAttribute("name", muc);
        }
        else if (name.equals("*")){
            muc = name1 * name2;
            model.addAttribute("name", muc);
        }
        else if (name.equals("/")){
            muc = name1 / name2;
            model.addAttribute("name", muc);
        }
        return "calc";
    }

    @GetMapping("/answer")
    String answer() {return "answer";}

    @PostMapping("/answer")
    String PrintText(Model model, @RequestParam(value = "NamePrint", required = false, defaultValue = "") String name) {
        model.addAttribute("name", name);
        return "answer";
    }

    @GetMapping("/trans")
    String trans() {return "trans";}


    @PostMapping("/trans")
    String toPrintText2(Model model, @RequestParam(value = "example1") String name,@RequestParam(value = "example2")String name1,@RequestParam(value = "NamePrint1")double name2)
    {
        Double rez;
        if(name.equals(name1) ){
            rez = name2;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Рубль") &&  name1.equals("Евро")){
            rez = name2 * 0.010159;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Рубль") &&  name1.equals("Доллар")){
            rez = name2 * 0.01072;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Рубль") &&  name1.equals("Вона")){
            rez = name2 * 14.55;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Евро") &&  name1.equals("Рубль")){
            rez = name2 * 98.44;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Евро") &&  name1.equals("Доллар")){
            rez = name2 * 1.06;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Евро")  &&  name1.equals("Вона")){
            rez = name2 * 1432.33;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Доллар")  &&  name1.equals("Рубль")){
            rez = name2 * 93.2893;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Доллар")  &&  name1.equals("Евро")){
            rez = name2 * 0.947617;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Доллар")  &&  name1.equals("Вона")){
            rez = name2 * 1357.3;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Вона")  &&  name1.equals("Рубль")){
            rez = name2 * 0.068725;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Вона")  &&  name1.equals("Евро")){
            rez = name2 * 0.000698;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Вона")  &&  name1.equals("Доллар")){
            rez = name2 * 0.000737;
            model.addAttribute("name", rez);
        }
        return "trans";
    }

}
