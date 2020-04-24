package com.colegio.app.interfaces;

import java.util.List;

import com.colegio.app.model.Persona; 

public interface DocenteInterface {

	void guardar(Persona persona);
	List<Persona> buscarTodas();
	Persona buscarPorId(Integer idPersona);
	void eliminar(Integer idPersona);
}
