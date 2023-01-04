package com.ipartek.formacion.spring.mf0966spring.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipartek.formacion.spring.mf0966spring.entidades.Profesor;

@RepositoryRestResource(path = "profesor", collectionResourceRel = "profesor")
public interface ProfesorRepository extends PagingAndSortingRepository<Profesor, Long>, CrudRepository <Profesor, Long>{ 

}
