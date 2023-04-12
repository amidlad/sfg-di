package sfg.spring5framework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello DI, Setter";
    }
}