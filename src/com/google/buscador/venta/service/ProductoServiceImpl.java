package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ProductoBean;
import com.google.buscador.venta.daos.DAOFactory;
import com.google.buscador.venta.daos.ProductoDAO;

public class ProductoServiceImpl implements ProductoService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	ProductoDAO dao = factoria.getProducto();

	@Override
	public List<ProductoBean> listaProductos() throws Exception {
		return dao.lista();
	}

	@Override
	public List<ProductoBean> buscaXprecio(double p1, double p2)
			throws Exception {
		// TODO Auto-generated method stub
		return dao.buscaXprecio(p1, p2);
	}
}
