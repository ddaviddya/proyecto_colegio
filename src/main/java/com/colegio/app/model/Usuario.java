package com.colegio.app.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.colegio.app.model.Perfil;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idusuario;
	private String usuario;
	private String password;
	private Integer estado;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable( name = "usuario_perfil",
				joinColumns = @JoinColumn(name="idusuario"), // llaves foraneas de la tabla UsuarioPerfil
				inverseJoinColumns = @JoinColumn(name="idperfil")
			)
	private List<Perfil> perfiles;
	
	public void agregar(Perfil tempPerfil) {
		if (perfiles == null) {
			perfiles= new LinkedList<Perfil>();
		}
		perfiles.add(tempPerfil);
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public List<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", usuario=" + usuario + ", password=" + password + ", estado="
				+ estado + ", perfiles=" + perfiles + "]";
	}
	
	

}
