package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.di.controller.GreetingController;

@SpringBootApplication
public class DiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiTestApplication.class, args);

		GreetingController controller = (GreetingController) context.getBean("greetingController");
		if (controller != null) {
			System.out.println("GreetingControllerBean exists in the Controller");
			System.out.println(controller.sayHello());
		} else {
			System.out.println("GreetingControllerBean doesn't exist");
		}
	}

}
