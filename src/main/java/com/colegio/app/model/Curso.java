package com.colegio.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso")
	private int idCurso;
	
	private String nombre;
	private String cursoCol;
	
	
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCursoCol() {
		return cursoCol;
	}
	public void setCursoCol(String cursoCol) {
		this.cursoCol = cursoCol;
	}
	
	
	@Override
	public String toString() {
		return "Curso [cursoCol=" + cursoCol + ", idCurso=" + idCurso + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
