package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ProductoBean;


public interface ProductoService {

	
	public abstract List<ProductoBean> listaProductos() throws Exception;
	public abstract List<ProductoBean> buscaXprecio(double p1, double p2) throws Exception;
	
}
