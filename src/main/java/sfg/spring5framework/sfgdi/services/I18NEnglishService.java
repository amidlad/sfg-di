package sfg.spring5framework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18NEnglishService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello - English";
    }
}
