package com.usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class IpController {

	@Autowired
	private HttpServletRequest request; // inyeccion del objeto HttpservletRequest

	// metodo sensible a los proxys
	@GetMapping("/client-ip")
	public String getClientIp() {
		String clientIp = request.getRemoteAddr(); // obtencion del ip
		return "Client IP: " + clientIp;
	}

	// metodo para intentar obtener una ip a pesar del proxy
	@GetMapping("/client-ip")
	public String getClientIpProxy() {
		String clientIp = request.getHeader("X-Forwarded-For");// verificar la direccion ip del cliente si se encuentra
																// a travez de un proxy
		if (clientIp == null || clientIp.length() == 0 || "unknown".equalsIgnoreCase(clientIp)) {// verifica si existe
																									// una peticion
																									// x-forwarded
			clientIp = request.getHeader("Proxy-Client-IP");
		}
		if (clientIp == null || clientIp.length() == 0 || "unknown".equalsIgnoreCase(clientIp)) {// "unknown" si no se
																									// puede determinar
																									// la cabecera del
																									// cliente
			clientIp = request.getHeader("WL-Proxy-Client-IP");
		}
		if (clientIp == null || clientIp.length() == 0 || "unknown".equalsIgnoreCase(clientIp)) {
			clientIp = request.getHeader("HTTP_CLIENT_IP");
		}
		if (clientIp == null || clientIp.length() == 0 || "unknown".equalsIgnoreCase(clientIp)) {
			clientIp = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (clientIp == null || clientIp.length() == 0 || "unknown".equalsIgnoreCase(clientIp)) {
			clientIp = request.getRemoteAddr(); // Si no se obtuvo se genera a traves de getRemoteAddr
		}
		return "Client IP: " + clientIp;
	}
}
