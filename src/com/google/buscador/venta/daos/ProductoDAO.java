package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.ProductoBean;

public interface ProductoDAO {
	
	public abstract List<ProductoBean> lista() throws Exception;
	public abstract List<ProductoBean> buscaXprecio(double p1,double p2) throws Exception;

}
