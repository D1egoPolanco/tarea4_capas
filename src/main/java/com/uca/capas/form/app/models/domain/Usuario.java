package com.uca.capas.form.app.models.domain;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Usuario {
	    @NotEmpty
	    @Size(min= 12, max=12)
		private String identificador;
	
	    @NotEmpty
	    @Size(min= 1, max=100)
	    private String nombre;
	
		@NotEmpty
		@Size(min= 1, max=100)
	    private String marca;
		
		@NotEmpty
		@Size(min= 1, max=500)
		private String descrpcion;
	
		@NotEmpty
		private String existencia;
		
		@NotEmpty
		@DateTimeFormat(pattern="dd-MMM-yyyy")
		private String fecha;
		
		
	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getExistencia() {
		return existencia;
	}


	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}


	public String getDescrpcion() {
		return descrpcion;
	}


	public void setDescrpcion(String descrpcion) {
		this.descrpcion = descrpcion;
	}


	public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

}
