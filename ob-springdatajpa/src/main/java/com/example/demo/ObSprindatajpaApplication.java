package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSprindatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSprindatajpaApplication.class, args);

		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("El num de coches en base de datos es: " + repository.count());

		// crear y almacenar un coche en base de datos
		Coche toyota = new Coche(null, "Toyota", "Prius", 2010);
		repository.save(toyota);
		
		Coche Bocho = new Coche(null, "Bocho", "Volsvaguen", 2010);
		repository.save(Bocho);

		System.out.println("El num de coches en base de datos es: " + repository.count());

		// recuperar todos
		System.out.println(repository.findAll());
	}

}
