package com.google.buscador.venta.bean;

public class DistritoBean {

	private String id,descripcion;

	public DistritoBean() {
		super();
	}

	public DistritoBean(String id, String descripcion) {
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
