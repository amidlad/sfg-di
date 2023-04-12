package sfg.spring5framework.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfg.spring5framework.sfgdi.services.ConstructorGreetingServiceImpl;

class PropertyInjectControllerTest {
    PropertyInjectController propertyInjectController;

    @BeforeEach
    void setUp(){
        propertyInjectController = new PropertyInjectController();

        propertyInjectController.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreetings() {

        System.out.println(propertyInjectController.getGreetings());
    }
}