package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Laptop;
import com.example.demo.repositories.LaptopRepository;

@RestController
public class LaptopController {
	//atributos
	private LaptopRepository laptopRepository;
	// constructores

	public LaptopController(LaptopRepository laptopRepository) {
		this.laptopRepository = laptopRepository;
	}
	//recuperar las laptops
	@GetMapping("/api/laptops")
	public List<Laptop> findAll(){
		return laptopRepository.findAll();
	}
	
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop){        
		//en H2 si se generan los datos desde la pagina al reiniciarse se pierden los datos
		return laptopRepository.save(laptop);
		
	}
}
