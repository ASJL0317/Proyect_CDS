package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.VendedorBean;


public interface VendedorDAO {
	
	public abstract int inserta(VendedorBean bean) throws Exception;
	public abstract int elimina(int id) throws Exception;
	public abstract int actualiza(VendedorBean bean) throws Exception;
	public abstract VendedorBean obtienePorPK(int id) throws Exception;
	public abstract List<VendedorBean> traeTodos() throws Exception;
	
	public abstract List<VendedorBean> buscaXEstadoCivil(String estado) throws Exception;
	
	
}
