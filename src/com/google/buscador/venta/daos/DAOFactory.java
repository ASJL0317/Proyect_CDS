package com.google.buscador.venta.daos;


public abstract class DAOFactory {

	public static final int MYSQL = 1;
	public static final int ORACLE = 2;

	//objetos daos
	public abstract VendedorDAO getVendedor();
	public abstract ProductoDAO getProducto();
	public abstract UbigeoDAO getUbigeo();
	public abstract SedeDAO getSede();
	
	
	// Se aplica polimorfismo
	public static DAOFactory getFactorty(int bd) {
		switch (bd) {
			case MYSQL:
				return new MySqlDAOFActory();
			
		}
		return null;
	}

	

}
