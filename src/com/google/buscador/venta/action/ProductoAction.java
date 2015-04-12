package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.ProductoBean;
import com.google.buscador.venta.service.ProductoService;
import com.google.buscador.venta.service.ProductoServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class ProductoAction extends ActionSupport {

	private ProductoBean pro;
	private String categoria,precio1,precio2;
	private List<ProductoBean> lstProducto;
	// permite obtener la sesion
	private Map<String, Object> session = ActionContext.getContext()
			.getSession();
	
	@Action(value = "/buscaXprecio", results = { @Result(name = "success", location = "/consultaProductosGrid.jsp") })
	public String buscaXprecio() {
		
		System.out.println("buscaXprecio");
		ProductoService service = new ProductoServiceImpl();
		
		try {
			double pi = Double.parseDouble(precio1);
			double pf = Double.parseDouble(precio2);
			lstProducto = service.buscaXprecio(pi,pf);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		session.put("PRODUCTOS", lstProducto);

		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	@Action(value = "/listaDataProducto", results = { @Result(name = "success", type="json") })
	public String lista() {
		lstProducto = (List<ProductoBean>)session.get("PRODUCTOS");
		return SUCCESS;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<ProductoBean> getLstProducto() {
		return lstProducto;
	}

	public void setLstProducto(List<ProductoBean> lstProducto) {
		this.lstProducto = lstProducto;
	}

	public String getPrecio1() {
		return precio1;
	}

	public void setPrecio1(String precio1) {
		this.precio1 = precio1;
	}

	public String getPrecio2() {
		return precio2;
	}

	public void setPrecio2(String precio2) {
		this.precio2 = precio2;
	}

	public ProductoBean getPro() {
		return pro;
	}

	public void setPro(ProductoBean pro) {
		this.pro = pro;
	}

	
	
}
