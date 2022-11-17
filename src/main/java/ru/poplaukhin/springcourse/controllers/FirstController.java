package ru.poplaukhin.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // она будет отсканирована @Component Scan'ом
@RequestMapping("/first") // теперь у всех методах в url будет префикс /first on URL
public class FirstController {

    @GetMapping("/hello") // при Get запросе <hello> мы попадаем в этот метод
    public String helloPage() {
        return "first/hello"; // обозначили что будем выводить hello.html из папки first по URL /hello
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye"; // обозначили что будем выводить goodbye.html из папки first по URL /goodbye
    }
}
