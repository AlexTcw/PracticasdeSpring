package com.example.obspringsecuritycifrado;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptionTest {
	/**
	 * BCrypt que genera su propio salt de 16 bytes
	 * 
	 * El resultado de cifrar con bcrypt será un String de 60 carácteres
	 * 
	 * $a version
	 * $10 fuerza (valor que va de 4 a 31, por defecto vale 10)
	 * los 22 siguientes caracteres son el salt generado
	 * */
	@Test
	void bcrypTest() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		String hashedPassword = passwordEncoder.encode("admin");
	}
}
