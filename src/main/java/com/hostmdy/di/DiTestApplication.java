package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.di.controller.ConstructorInjectionController;
import com.hostmdy.di.controller.PropertyInjectioncontroller;
import com.hostmdy.di.controller.SetterInjectionController;



@SpringBootApplication
public class DiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiTestApplication.class, args);
		
		
		PropertyInjectioncontroller propertyController =
				context.getBean(PropertyInjectioncontroller.class);
		System.out.println("property injection : "+propertyController.sayHello());
		
		SetterInjectionController setterController = 
				context.getBean(SetterInjectionController.class);
		System.out.println("ConstructorInjection : "+setterController.sayHello());
		
		ConstructorInjectionController constructorController = 
				context.getBean(ConstructorInjectionController.class);
		System.out.println("ConstructorInjection : "+constructorController.sayHello());
		
	};
	
	
	
		
	

}
