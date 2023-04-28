package com.example.demo;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringdatajpa1Application.class, args);

		ProductosRepository repository = context.getBean(ProductosRepository.class);

		//Datos almacenados hasta el momento
		System.out.println("el numero de productos en la Base de datos es: "+ repository.count());
		//Crear y almacenar datos
		Productos sudadera = new Productos(null,"Capucha","GAP",350);
		repository.save(sudadera);

		Productos chamarra = new Productos(null, "Cierre", "AberCrown", 400);
		repository.save(chamarra);
		System.out.println("el numero de productos en la Base de datos es: "+ repository.count());
		
		System.out.println(repository.findAll());
	}
}
