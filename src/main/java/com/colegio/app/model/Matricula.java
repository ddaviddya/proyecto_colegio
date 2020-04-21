package com.colegio.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_matricula")
	private int idMatricula;
	@Column(name = "fec_matricula")
	private Date fecMatricula;
	private Double pago;
	private int estado;
	@Column(name = "id_plantilla_matricula")
	private int idPlantillaMatricula;
	
	public int getIdMatricula() {
		return idMatricula;
	}
	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}
	public Date getFecMatricula() {
		return fecMatricula;
	}
	public void setFecMatricula(Date fecMatricula) {
		this.fecMatricula = fecMatricula;
	}
	public Double getPago() {
		return pago;
	}
	public void setPago(Double pago) {
		this.pago = pago;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdPlantillaMatricula() {
		return idPlantillaMatricula;
	}
	public void setIdPlantillaMatricula(int idPlantillaMatricula) {
		this.idPlantillaMatricula = idPlantillaMatricula;
	}
	@Override
	public String toString() {
		return "Matricula [idMatricula=" + idMatricula + ", fecMatricula=" + fecMatricula + ", pago=" + pago
				+ ", estado=" + estado + ", idPlantillaMatricula=" + idPlantillaMatricula + "]";
	}
	
	
}
