package com.colegio.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.app.model.Persona;

public interface DocenteRepository extends JpaRepository<Persona,Integer > {

	

}
