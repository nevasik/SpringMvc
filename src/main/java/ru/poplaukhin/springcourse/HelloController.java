package ru.poplaukhin.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // внутри этой аннотации должны указать какой url будет приходить в этот метод Контроллера
    @GetMapping("/hello-world") // когда пользователь в строке браузера будет набирать </hello-world>, его запрос будет приходить в этот метод-контроллер
    public String sayHello() {
        return "hello_world";
    }
}
