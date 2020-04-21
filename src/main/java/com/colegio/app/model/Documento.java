package com.colegio.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documentos")
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_documento")
	private int idDocumento;
	@Column(name = "fec_creacion")
	private Date fecCreacion;
	@Column(name = "fec_actualizacion")
	private Date fecActualizacion;
	@Column(name = "contenido_doc")
	private String contenidoDoc;
	@Column(name = "otros_detalles_doc")
	private String otrosDetallesDoc;
	
		
	public int getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}
	public Date getFecCreacion() {
		return fecCreacion;
	}
	public void setFecCreacion(Date fecCreacion) {
		this.fecCreacion = fecCreacion;
	}
	public Date getFecActualizacion() {
		return fecActualizacion;
	}
	public void setFecActualizacion(Date fecActualizacion) {
		this.fecActualizacion = fecActualizacion;
	}
	public String getContenidoDoc() {
		return contenidoDoc;
	}
	public void setContenidoDoc(String contenidoDoc) {
		this.contenidoDoc = contenidoDoc;
	}
	public String getOtrosDetallesDoc() {
		return otrosDetallesDoc;
	}
	public void setOtrosDetallesDoc(String otrosDetallesDoc) {
		this.otrosDetallesDoc = otrosDetallesDoc;
	}
	
	
	@Override
	public String toString() {
		return "Documento [idDocumento=" + idDocumento + ", fecCreacion=" + fecCreacion + ", fecActualizacion="
				+ fecActualizacion + ", contenidoDoc=" + contenidoDoc + ", otrosDetallesDoc=" + otrosDetallesDoc + "]";
	}
	
	
	
}
