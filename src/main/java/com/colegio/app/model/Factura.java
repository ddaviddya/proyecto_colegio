package com.colegio.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facturas")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura")
	private int idFactura;
	@Column(name = "fec_factura")
	private Date fecFactura;
	private Double descuento;
	private Double igv;
	private Double total;
	
	
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public Date getFecFactura() {
		return fecFactura;
	}
	public void setFecFactura(Date fecFactura) {
		this.fecFactura = fecFactura;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public Double getIgv() {
		return igv;
	}
	public void setIgv(Double igv) {
		this.igv = igv;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecFactura=" + fecFactura + ", descuento=" + descuento + ", igv="
				+ igv + ", total=" + total + "]";
	}
	
	
	
}
