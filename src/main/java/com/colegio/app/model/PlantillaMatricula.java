package com.colegio.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plantilla_matricula")
public class PlantillaMatricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_plantilla_matricula")
	private int idPlantillaMatricula;
	@Column(name = "costo_inicial")
	private Double costoInicial;
	@Column(name = "costo_primaria")
	private Double costoPrimaria;
	@Column(name = "costo_secundaria")
	private Double costoSecundaria;
	
	
	
	public int getIdPlantillaMatricula() {
		return idPlantillaMatricula;
	}
	public void setIdPlantillaMatricula(int idPlantillaMatricula) {
		this.idPlantillaMatricula = idPlantillaMatricula;
	}
	public Double getCostoInicial() {
		return costoInicial;
	}
	public void setCostoInicial(Double costoInicial) {
		this.costoInicial = costoInicial;
	}
	public Double getCostoPrimaria() {
		return costoPrimaria;
	}
	public void setCostoPrimaria(Double costoPrimaria) {
		this.costoPrimaria = costoPrimaria;
	}
	public Double getCostoSecundaria() {
		return costoSecundaria;
	}
	public void setCostoSecundaria(Double costoSecundaria) {
		this.costoSecundaria = costoSecundaria;
	}
	
	
	@Override
	public String toString() {
		return "PlantillaMatricula [idPlantillaMatricula=" + idPlantillaMatricula + ", costoInicial=" + costoInicial
				+ ", costoPrimaria=" + costoPrimaria + ", costoSecundaria=" + costoSecundaria + "]";
	}
	
	
}
