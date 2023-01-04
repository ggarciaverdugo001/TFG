package com.ipartek.formacion.spring.mf0966spring.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder 
@Entity
@Table(name = "curso")
public class Profesor { 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int codigo; 
	
private String nombre; 
	  
	public Profesor(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre; 
	}

}
