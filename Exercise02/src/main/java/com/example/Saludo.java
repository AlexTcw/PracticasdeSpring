package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Saludo {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 HelloWorld hello = (HelloWorld) context.getBean("hello");
		 
		 String texto = hello.HelloWorld();
		 System.out.println(texto);
	}

}
