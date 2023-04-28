package com.example.obrestdatajpa.service.ip;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public class IpServiceImp implements IpService {

	@Autowired
	private HttpServletRequest request;

	// metodo sensible a los proxys
	@Override
	public String getClientIp() {
		String clientIp = request.getRemoteAddr(); // obtencion del ip
		return "Client IP: " + clientIp;
	}

	// Metodo que trata busca la ip a pesar del proxy
	@Override
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
