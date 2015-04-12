package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.SedeBean;
import com.google.buscador.venta.service.SedeService;
import com.google.buscador.venta.service.SedeServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class SedeAction extends ActionSupport {

	private SedeBean sede;
	private List<SedeBean> lstSede;

	// permite obtener la sesion
	private Map<String, Object> session = ActionContext.getContext()
			.getSession();

	// para la paginacion de la grilla(exactamente igual)
	private Integer rows = 0, page = 0, total = 0, records = 0;

	@Action(value = "/buscaXdistrito", results = { @Result(name = "success", location = "/consultaSedeGrid.jsp") })
	public String buscaXEstado() {
		
		System.out.println("buscaXdistrito");

		SedeService service = new SedeServiceImpl();

		try {
			lstSede = service.listaXdistrito(sede.getDisSede());
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.put("sedes", lstSede);

		return SUCCESS;
	}

	@SuppressWarnings("unchecked")
	@Action(value = "/listaDataSede", results = { @Result(name = "success", type = "json") })
	public String cargaGrilla() {
		
		System.out.println("cargaGrilla");

		records = ((ArrayList<SedeBean>) session.get("sedes")).size();

		int hasta = (rows * page);
		int desde = hasta - rows;

		if (hasta > records)
			hasta = records;

		lstSede = ((ArrayList<SedeBean>) session.get("sedes")).subList(desde, hasta);

		total = (int) Math.ceil((double) records / (double) rows);

		return SUCCESS;
	}

	public SedeBean getSede() {
		return sede;
	}

	public void setSede(SedeBean sede) {
		this.sede = sede;
	}

	public List<SedeBean> getLstSede() {
		return lstSede;
	}

	public void setLstSede(List<SedeBean> lstSede) {
		this.lstSede = lstSede;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}
	
	
	
}
