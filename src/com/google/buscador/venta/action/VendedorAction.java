package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.VendedorBean;
import com.google.buscador.venta.service.VendedorService;
import com.google.buscador.venta.service.VendedorServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class VendedorAction extends ActionSupport {

	private VendedorBean vendedor;
	private List<VendedorBean> lstVendedor;

	// permite obtener la sesion
	private Map<String, Object> session = ActionContext.getContext()
			.getSession();

	// para la paginacion de la grilla(exactamente igual)
	private Integer rows = 0, page = 0, total = 0, records = 0;

	@Action(value = "/buscaXEstado", results = { @Result(name = "success", location = "/consultaVendedorGrid.jsp") })
	public String buscaXEstado() {
		System.out.println("buscaXEstado");

		VendedorService service = new VendedorServiceImpl();

		try {
			lstVendedor = service.listaXEstado(vendedor.getStrEstado());
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.put("vendedores", lstVendedor);

		return SUCCESS;
	}

	@SuppressWarnings("unchecked")
	@Action(value = "/listaDataVendedor", results = { @Result(name = "success", type = "json") })
	public String cargaGrilla() {
		System.out.println("cargaGrilla");

		records = ((ArrayList<VendedorBean>) session.get("vendedores")).size();

		int hasta = (rows * page);
		int desde = hasta - rows;

		if (hasta > records)
			hasta = records;

		lstVendedor = ((ArrayList<VendedorBean>) session.get("vendedores")).subList(desde, hasta);

		total = (int) Math.ceil((double) records / (double) rows);

		return SUCCESS;
	}

	@Action(value = "/registraVendedor", results = { @Result(name = "success", location = "/insertaVendedor.jsp") })
	public String inserta() {
		VendedorService service = new VendedorServiceImpl();

		try {
			service.registraVendedor(vendedor);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public VendedorBean getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorBean vendedor) {
		this.vendedor = vendedor;
	}

	public List<VendedorBean> getLstVendedor() {
		return lstVendedor;
	}

	public void setLstVendedor(List<VendedorBean> lstVendedor) {
		this.lstVendedor = lstVendedor;
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
