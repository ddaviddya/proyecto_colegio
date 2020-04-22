package com.colegio.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoController {

	@GetMapping("/listacurso")
	public String listaCurso() {
		return "listaCurso";
	}
	
}
