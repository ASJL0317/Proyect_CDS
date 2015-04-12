package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.ProductoBean;
import com.google.buscador.venta.bean.VendedorBean;
import com.google.buscador.venta.service.ProductoServiceImpl;
import com.google.buscador.venta.service.VendedorServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
@ParentPackage(value="dawi")
public class ComboAction extends ActionSupport{

	
	private List<VendedorBean> lstVendedor = new ArrayList<VendedorBean>();
	
	private List<ProductoBean> lstProducto = new ArrayList<ProductoBean>();
	
	//El tipo es JSON, porque la acción retorna la data en forma JSON
	//Esta data es consumida por los tags de Struts del Combo
	//Es json porque esto utiliza ajax internamente
	
	@Action(value="/cargaVendedor",	results={@Result(name="success",type="json")})
	public String cargaComboVendedor(){
		VendedorServiceImpl service = new VendedorServiceImpl();
		
		try {
			lstVendedor = service.listaVendedor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@Action(value="/cargaProducto",	results={@Result(name="success",type="json")})
	public String cargaComboProducto(){
		ProductoServiceImpl service = new ProductoServiceImpl();
		
		try {
			lstProducto = service.listaProductos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public List<VendedorBean> getLstVendedor() {
		return lstVendedor;
	}

	public void setLstVendedor(List<VendedorBean> lstVendedor) {
		this.lstVendedor = lstVendedor;
	}

	public List<ProductoBean> getLstProducto() {
		return lstProducto;
	}

	public void setLstProducto(List<ProductoBean> lstProducto) {
		this.lstProducto = lstProducto;
	}
	
	
	
}
