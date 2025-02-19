package sfg.spring5framework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18NSpanishService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hola Mundo - Spanish";
    }
}
