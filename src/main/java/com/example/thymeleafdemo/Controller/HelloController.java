package com.example.thymeleafdemo.Controller;

import com.example.thymeleafdemo.Model.Person;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
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
        model.addAttribute("name", name);
        return "Kevin";
    }

    @GetMapping("fredag")
    public String erDetFredag(Model model){
       String ugedag = "FRIDAY";//LocalDate.now().getDayOfWeek().toString();
        model.addAttribute("day", ugedag);
        return "IsItFriday";
    }

    @GetMapping("person")
    public String getPerson(Model model){
        Person person = new Person ("Benjamin", 20);
        model.addAttribute("p", person);
        return "personHTML";
    }

    @GetMapping("aLotOfPersons")
    public String getPersonList(Model model){
        Person p1 = new Person ("Benjamin", 20);
        Person p2 = new Person ("Maria", 19);
        Person p3 = new Person ("Kaj", 23);
        Person p4 = new Person ("Thomas", 18);
        Person p5 = new Person ("Mohamed", 23);
        List<Person> personList = new ArrayList<>(List.of(p1,p2,p3,p4,p5));
        model.addAttribute("personList", personList);
        return "personListHTML";
    }
}
