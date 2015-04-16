package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.VendedorBean;
import com.google.buscador.venta.daos.DAOFactory;
import com.google.buscador.venta.daos.VendedorDAO;

public class VendedorServiceImpl implements VendedorService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	VendedorDAO dao = factoria.getVendedor();

	public int registraVendedor(VendedorBean bean) throws Exception{
		return dao.inserta(bean);
	}
	public int eliminaVendedor(int id) throws Exception{
		return dao.elimina(id);
	}
	public VendedorBean buscaVendedor(int id) throws Exception{
		return dao.obtienePorPK(id);
	}
	public int actualizaVendedor(VendedorBean bean) throws Exception{
		return dao.actualiza(bean);
	}
	public List<VendedorBean> listaVendedor() throws Exception{
		return dao.traeTodos();
	}
	public List<VendedorBean> listaXEstado(String estado) throws Exception {
		return dao.buscaXEstadoCivil(estado);
	}
	
	
	
	
}
