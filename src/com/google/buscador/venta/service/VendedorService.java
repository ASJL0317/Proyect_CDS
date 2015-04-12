package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.VendedorBean;

public interface VendedorService {

	public abstract int registraVendedor(VendedorBean bean) throws Exception;

	public abstract int eliminaVendedor(int id) throws Exception;

	public abstract VendedorBean buscaVendedor(int id) throws Exception;

	public abstract int actualizaVendedor(VendedorBean bean) throws Exception;

	public abstract List<VendedorBean> listaVendedor() throws Exception;
	
	public abstract List<VendedorBean> listaXEstado(String estado) throws Exception;
}
