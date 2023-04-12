package sfg.spring5framework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello DI, PRIMARY";
    }
}
