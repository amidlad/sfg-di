package sfg.spring5framework.sfgdi.controller;

import org.springframework.stereotype.Controller;
import sfg.spring5framework.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Hello world!!");

        return greetingService.sayHello();
    }

}
