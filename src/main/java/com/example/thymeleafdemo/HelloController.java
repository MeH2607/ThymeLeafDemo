package com.example.thymeleafdemo;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Controller
@RequestMapping("say")
public class HelloController {

    @GetMapping("hello")
   public String sayHello(String name, Model model){
        model.addAttribute("date", LocalDate.now());
    model.addAttribute("yo","Hello " + name + " :D on this beautiful date called " + LocalDate.now());
    model.addAttribute("day","It is " + LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL,new Locale("da", "DK")));
        return "HtmlFil";
    }

    @GetMapping("isthiskevin")
    public String checkIfKevin(String name, Model model){
        model.addAttribute("name == 'Kevin'", " " + name);
        return "Kevin";
    }
}
