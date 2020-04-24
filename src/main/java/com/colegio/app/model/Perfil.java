package com.colegio.app.model;

<<<<<<< HEAD
import javax.persistence.Column;
=======
>>>>>>> 1c2d6acfe1516b4d0a8046903d6092775feaa333
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil {
<<<<<<< HEAD

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_perfil")
	private int idPerfil;
	private String nombre;
	
	
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
=======
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_perfil;
	private String nombre;
	
	public int getId_perfil() {
		return id_perfil;
	}
	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
>>>>>>> 1c2d6acfe1516b4d0a8046903d6092775feaa333
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
<<<<<<< HEAD
	
	
	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nombre=" + nombre + "]";
	}
	
	
=======
	@Override
	public String toString() {
		return "Perfil [id_perfil=" + id_perfil + ", nombre=" + nombre + "]";
	}
	
	

>>>>>>> 1c2d6acfe1516b4d0a8046903d6092775feaa333
}
