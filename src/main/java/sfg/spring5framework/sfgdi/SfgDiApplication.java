package sfg.spring5framework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sfg.spring5framework.sfgdi.controller.ConstructorInjectedController;
import sfg.spring5framework.sfgdi.controller.MyController;
import sfg.spring5framework.sfgdi.controller.PropertyInjectController;
import sfg.spring5framework.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ct = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ct.getBean("myController");

		//String greeting = myController.sayHello();

		System.out.println("----- Primary Bean -----");
		System.out.println(myController.sayHello());

		System.out.println("----- Property -----");

		PropertyInjectController propertyInjectController = (PropertyInjectController) ct.getBean("propertyInjectController");
		System.out.println(propertyInjectController.getGreetings());

		System.out.println("----- Setter -----");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ct.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());

		System.out.println("----- Constructor -----");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)  ct.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());

	}

}
