package com.colegio.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.app.interfaces.DocenteInterface;
import com.colegio.app.model.Persona;
import com.colegio.app.repository.DocenteRepository;

@Service
public class DocenteServiceJpa implements DocenteInterface {

	@Autowired
	private DocenteRepository docenteRepo;
	
	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		docenteRepo.save(persona);
	}

	@Override
	public List<Persona> buscarTodas() {
		// TODO Auto-generated method stub
		return docenteRepo.findAll();
	}

	@Override
	public Persona buscarPorId(Integer idPersona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer idPersona) {
		// TODO Auto-generated method stub
		docenteRepo.deleteById(idPersona);
	}

}
