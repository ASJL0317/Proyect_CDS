package com.google.buscador.venta.daos;


public class MySqlDAOFActory extends DAOFactory {

	@Override
	public VendedorDAO getVendedor() {
		return new MySqlVendedorDAO();
	}

	@Override
	public ProductoDAO getProducto() {
		return new MySqlProductoDAO();
	}

	@Override
	public UbigeoDAO getUbigeo() {
		return new MySqlUbigeo();
	}

	@Override
	public SedeDAO getSede() {
		return new MySqlSede();
	}

	
}
