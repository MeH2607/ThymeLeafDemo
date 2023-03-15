package com.example.thymeleafdemo.Controller;

import com.example.thymeleafdemo.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("form")
public class FromController {

    @GetMapping("addPerson")
    public String addPersonWithForm(Model model) {
        model.addAttribute("person", new Person());
        return "createPersonForm";
    }
}
