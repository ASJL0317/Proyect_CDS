package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.UbigeoBean;
import com.google.buscador.venta.service.UbigeoService;
import com.google.buscador.venta.service.UbigeoServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "dawi")
public class UbigeoAction extends ActionSupport {

	private static final long serialVersionUID = 7968544374444173511L;
	private static final Log log = LogFactory.getLog(UbigeoAction.class);
	
	private List<UbigeoBean> lstDepartamento = new ArrayList<UbigeoBean>();
	private List<UbigeoBean> lstProvincia = new ArrayList<UbigeoBean>();
	private List<UbigeoBean> lstDistrito = new ArrayList<UbigeoBean>();
	

	private Map<String, Object> session = (Map<String, Object>)ActionContext.getContext().getSession();
	private UbigeoService service = new UbigeoServiceImpl();
	
	private String departamento;
	private String distrito;
	private String provincia;

	

	private boolean escape = true;

	

	
	@SuppressWarnings("unchecked")
	@Action(value = "/cargaUbigeo", results = { @Result(name="success",type="json") })
	public String cargaUbigeo() throws  Exception
	{  
		log.info("Dentro de carga departamento origen");
		log.info("Departamento : " + departamento);
		log.info("Provincia : " + provincia);
		
		if(session.get("objDepartamentos") == null){
			lstDepartamento = service.traeDepartamentos();
			session.put("objDepartamentos", lstDepartamento);
		}else{
			lstDepartamento = (List<UbigeoBean>)session.get("objDepartamentos");
		}
		
		if(departamento!= null && !departamento.trim().equals("")&& !departamento.trim().equals("-1")){
			log.info("Dentro de carga provincia destino");
			UbigeoBean ubigeoBean = new UbigeoBean();
			ubigeoBean.setIdDepartamento(departamento);
			lstProvincia = service.traeProvincias(ubigeoBean);	
		}
		

		if(departamento!= null && provincia!= null && !departamento.trim().equals("") && !provincia.trim().equals("")&& !departamento.trim().equals("-1") && !provincia.trim().equals("-1")){
			log.info("Dentro de carga distrito destino");
			UbigeoBean ubigeoBean2 = new UbigeoBean();
			ubigeoBean2.setIdDepartamento(departamento);
			ubigeoBean2.setIdProvincia(provincia);
			lstDistrito = service.traeDistrito(ubigeoBean2);	
		}
		

		return SUCCESS;
	}
	
	
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}



	public String getProvincia() {
		return provincia;
	}



	public boolean isEscape() {
		return escape;
	}



	
	public List<UbigeoBean> getLstDepartamento() {
		return lstDepartamento;
	}

	public void setLstDepartamento(List<UbigeoBean> lstDepartamento) {
		this.lstDepartamento = lstDepartamento;
	}

	public List<UbigeoBean> getLstProvincia() {
		return lstProvincia;
	}

	public void setLstProvincia(List<UbigeoBean> lstProvincia) {
		this.lstProvincia = lstProvincia;
	}

	public List<UbigeoBean> getLstDistrito() {
		return lstDistrito;
	}

	public void setLstDistrito(List<UbigeoBean> lstDistrito) {
		this.lstDistrito = lstDistrito;
	}

	public void setEscape(boolean escape) {
		this.escape = escape;
	}

	public String getDepartamento() {
		return departamento;
	}

}
