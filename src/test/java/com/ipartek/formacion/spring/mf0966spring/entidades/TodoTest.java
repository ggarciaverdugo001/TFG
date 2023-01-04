package com.ipartek.formacion.spring.mf0966spring.entidades;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ipartek.formacion.spring.mf0966spring.repositorios.CursoRepository;
import com.ipartek.formacion.spring.mf0966spring.repositorios.ResenasRepository;

@SpringBootTest 
public class TodoTest {
	
	@Autowired
	//private LibroRepository repo; 
	private ResenasRepository re; 
	
	/**@Test
	public void obtenerTodos() {
		System.out.println(repo.findAll());
	}
	
	@Test
	public void buscarPorNombre(){
		System.out.println("Por NOMBRE :" + repo.findByNombre("Cómo programar Java y no hacer chapuzas"));
	}
	
**/
	
	
	@Test 
	public void obtenerTodos() {
		System.out.println(re.findAll()); 
	}
	

	
}
