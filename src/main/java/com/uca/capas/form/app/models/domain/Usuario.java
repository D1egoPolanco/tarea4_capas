package com.uca.capas.form.app.models.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Usuario {
	
		private String identificador;
	
	//@NotEmpty(message = "el nombre no puede ser vacio")
	@Size(min= 1, max=25)
	private String nombre;
	
	@NotEmpty
	@Size(min= 1, max=25)
	private String apellido;

	@NotBlank
	@Size(min= 1, max=25)
	private String username;
	
	@NotEmpty
	@Size(min= 1, max=25)
	private String password;
	
	@NotEmpty
	@Size(min= 1, max=100)
	private String email;
	
	@Size(min=8, max= 8)
	private String movil;
	

	public String getMovil() {
		return movil;
	}


	public void setMovil(String movil) {
		this.movil = movil;
	}


	public String getUsername() {
		return username;
	}
	

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

}
