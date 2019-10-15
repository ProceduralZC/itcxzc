package org.cxzc.myyoung.springboot_4;

import org.cxzc.myyoung.springboot_4.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class Springboot4Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot4Application.class, args);
    }

    @RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("公众号   程序职场", 11);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("刘德华", 60);
        Person p2 = new Person("张学友", 58);
        Person p3 = new Person("吴奇隆", 55);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }


}
