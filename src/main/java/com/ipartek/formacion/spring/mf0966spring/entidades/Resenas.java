package com.ipartek.formacion.spring.mf0966spring.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Builder
@Entity
@Table(name = "reseñas") 
public class Resenas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id; 
	
	
	private String reseñas;


	public Resenas(int id, String reseñas) {
		super();
		this.id = id;
		this.reseñas = reseñas;
	}  
	
	
	
	

}
