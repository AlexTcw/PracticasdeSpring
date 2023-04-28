package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		NotificationService notificationService = (NotificationService)context.getBean("notificationService");
		String texto = notificationService.saludo();
		System.out.println(texto);
		
		NotificationService notificationService2 = (NotificationService)context.getBean("notificationService");
		texto = notificationService.saludo();
		System.out.println(texto);
		
		UserService service = (UserService) context.getBean("userService");
		System.out.println(service.notificationService.saludo());

	}
}
