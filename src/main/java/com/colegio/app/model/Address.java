package com.colegio.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_direccion")
	private int idDireccion;
	
	@Column(name = "detalles_direccion")
	private String detallesDireccion;
	
	@Column(name = "id_persona")
	private int idPersona;
	
	
	public int getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getDetallesDireccion() {
		return detallesDireccion;
	}
	public void setDetallesDireccion(String detallesDireccion) {
		this.detallesDireccion = detallesDireccion;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	@Override
	public String toString() {
		return "Address [idDireccion=" + idDireccion + ", detallesDireccion=" + detallesDireccion + ", idPersona="
				+ idPersona + "]";
	}
	
	
}
