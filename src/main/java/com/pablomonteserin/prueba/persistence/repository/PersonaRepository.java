package com.pablomonteserin.prueba.persistence.repository;

import com.pablomonteserin.prueba.intity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}