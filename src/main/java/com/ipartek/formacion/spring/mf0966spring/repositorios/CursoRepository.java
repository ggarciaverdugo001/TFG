package com.ipartek.formacion.spring.mf0966spring.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipartek.formacion.spring.mf0966spring.entidades.Curso;

@RepositoryRestResource(path = "curso", collectionResourceRel = "curso")
public interface CursoRepository extends PagingAndSortingRepository<Curso, Long>, CrudRepository <Curso, Long>{ 
	
	  // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords
			public Curso findByCodigo(int codigo); 

}
