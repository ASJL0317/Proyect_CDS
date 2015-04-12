package com.google.buscador.venta.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
@ParentPackage(value= "dawi")
public class PruebaAction extends ActionSupport{
	
	private String dni;
	
	@Action(value="/votacion",
				results={
					@Result(location="/respuesta.jsp", name="success"),
					@Result(location="/frmInicio.jsp", name="error"),
					})
	public String muestraVotacion(){
		System.out.println("El dni : " + dni);
		String mensaje ="";
		
		if(dni.matches("[0-9]{8}")){
			char c = dni.charAt(0);
			int digito = Character.getNumericValue(c);

			if(digito<=3) 		mensaje = "Huaycan";
			else if(digito<=8) 	mensaje = "Carabayllo";
			else				mensaje = "Ticlo Chico";
		
			addActionMessage(mensaje);
			return SUCCESS;
		}else{
			mensaje ="DNI incorrecto";
			addActionMessage(mensaje);
			return ERROR;
		}
	}
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
