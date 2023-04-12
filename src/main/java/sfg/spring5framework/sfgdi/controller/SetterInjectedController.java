package sfg.spring5framework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.spring5framework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService( GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.sayHello();
    }

}
