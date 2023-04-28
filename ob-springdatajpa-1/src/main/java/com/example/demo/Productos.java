package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Productos {
    //atributos encapsulados
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String mark;
    private double precio;
    //constructores
    public Productos(){
    }

    public Productos(Long id, String name, String mark, double precio) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.precio = precio;
    }
    
    //getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //tostring

	@Override
	public String toString() {
		return "Productos [id=" + id + ", name=" + name + ", mark=" + mark + ", precio=" + precio + "]";
	}
    
}
