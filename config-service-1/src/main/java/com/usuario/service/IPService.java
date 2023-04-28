package com.usuario.service;

import org.springframework.stereotype.Service;

@Service
public interface IPService {

	String getClientIp();

	String getClientIpProxy();
		
}
