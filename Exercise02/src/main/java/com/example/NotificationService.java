package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	public NotificationService() {
		System.out.println("Proceso notificacion");
	}
	
	public String saludo() {
		
		return "Hola mundo!";
	}

}
