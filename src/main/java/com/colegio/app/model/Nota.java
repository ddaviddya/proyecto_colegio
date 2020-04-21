package com.colegio.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "notas")
public class Nota {

	
	@Column(name = "nota_parcial")
	private String notaParcial;
	@Column(name = "nota_final")
	private String notaFinal;
	
	private String practicas;
	@Column(name = "id_curso")
	private int idCurso;
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNotaParcial() {
		return notaParcial;
	}
	public void setNotaParcial(String notaParcial) {
		this.notaParcial = notaParcial;
	}
	public String getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(String notaFinal) {
		this.notaFinal = notaFinal;
	}
	public String getPracticas() {
		return practicas;
	}
	public void setPracticas(String practicas) {
		this.practicas = practicas;
	}
	@Override
	public String toString() {
		return "Nota [idCurso=" + idCurso + ", notaFinal=" + notaFinal + ", notaParcial=" + notaParcial + ", practicas="
				+ practicas + "]";
	}
	
	
}
