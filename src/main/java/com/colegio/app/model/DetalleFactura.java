package com.colegio.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {

	
	private int cantidad;
	@Column(name = "subtotal")
	private Double subTotal;
	@Column(name = "id_factura")
	private int idFactura;
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	@Override
	public String toString() {
		return "DetalleFactura [cantidad=" + cantidad + ", subTotal=" + subTotal + ", idFactura=" + idFactura + "]";
	}
	
	
	
}
