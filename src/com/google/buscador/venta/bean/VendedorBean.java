package com.google.buscador.venta.bean;


public class VendedorBean{
	
	private int intCodigo;
	private String strNombre;
	private String strApellido;
	private int intEdad;
	private String strFecha;
	private String strEstado;
	private String strDistrito;
	
	@Override
	public String toString() {
		return "VendedorBean [intCodigo=" + intCodigo + ", strNombre="
				+ strNombre + ", strApellido=" + strApellido + ", intEdad="
				+ intEdad + ", strFecha=" + strFecha + ", strEstado="
				+ strEstado + ", strDistrito=" + strDistrito + "]";
	}
	public String getNombreCompleto() {
		return strNombre+" " + strApellido;
	}
	
	public int getIntCodigo() {
		return intCodigo;
	}
	public void setIntCodigo(int codigo) {
		this.intCodigo = codigo;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String nombre) {
		this.strNombre = nombre;
	}
	public String getStrApellido() {
		return strApellido;
	}
	public void setStrApellido(String apellido) {
		this.strApellido = apellido;
	}
	public int getIntEdad() {
		return intEdad;
	}
	public void setIntEdad(int edad) {
		this.intEdad = edad;
	}
	public String getStrFecha() {
		return strFecha;
	}
	public void setStrFecha(String strFecha) {
		this.strFecha = strFecha;
	}
	public String getStrEstado() {
		return strEstado;
	}
	public void setStrEstado(String estado) {
		this.strEstado = estado;
	}
	public String getStrDistrito() {
		return strDistrito;
	}
	public void setStrDistrito(String distrito) {
		this.strDistrito = distrito;
	}
}
