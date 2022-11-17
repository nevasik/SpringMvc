package ru.poplaukhin.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // она будет отсканирована @Component Scan'ом
public class FirstController {

    @GetMapping("/hello") // при Get запросе <hello> мы попадаем в этот метод
    public String helloPage() {
        return "first/hello"; // обозначили что будем выводить hello из папки first
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye"; // обозначили что будем выводить goodbye из папки first
    }
}
