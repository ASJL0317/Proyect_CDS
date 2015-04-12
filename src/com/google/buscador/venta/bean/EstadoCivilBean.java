package com.google.buscador.venta.bean;

public class EstadoCivilBean {
	private String id,descripcion;
	public EstadoCivilBean() {
		super();
	}

	public EstadoCivilBean(String id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	public String getFormato(){
		return id + " -> "  + descripcion;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
