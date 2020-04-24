package com.colegio.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.colegio.app.interfaces.DocenteInterface;
import com.colegio.app.model.Persona;
import com.colegio.app.model.Usuario; 

@Controller
@RequestMapping("/docente")
public class DocenteController {
	
	@Autowired
	private DocenteInterface docenteInterface;
	
	@Autowired
	private PasswordEncoder passwordEncoder; 

	@GetMapping("/index")
	public String mostrarIndex(Model model) {
    	 
		return "docente/index";
	}
	
	
	
}
