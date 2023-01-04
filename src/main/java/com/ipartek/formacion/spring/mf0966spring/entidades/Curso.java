package com.ipartek.formacion.spring.mf0966spring.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Builder 
 
@Entity 
@Table(name = "curso")
public class Curso {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int codigo; 
	
	
	private String nombre; 
	private String identificador; 
	private int nhoras;
	
	
	
	@ManyToOne 
	@JoinColumn(name = "profesor_codigo") 
	private Profesor profesor;



	public Curso(int codigo, String nombre, String identificador, int nhoras, Profesor profesor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.identificador = identificador;
		this.nhoras = nhoras;
		this.profesor = profesor;
	}
	

	
	
	
 
	
	
	
}
