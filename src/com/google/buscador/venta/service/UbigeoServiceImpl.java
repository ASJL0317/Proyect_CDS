package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.UbigeoBean;
import com.google.buscador.venta.daos.DAOFactory;
import com.google.buscador.venta.daos.UbigeoDAO;

public class UbigeoServiceImpl implements UbigeoService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	UbigeoDAO dao = factoria.getUbigeo();
	
	@Override
	public List<UbigeoBean> traeDepartamentos() throws Exception {
		return dao.traeDepartamentos();
	}
	@Override
	public List<UbigeoBean> traeProvincias(UbigeoBean ubigeoBean)throws Exception {
		return dao.traeProvincias(ubigeoBean);
	}
	@Override
	public List<UbigeoBean> traeDistrito(UbigeoBean ubigeoBean)	throws Exception {
		return dao.traeDistritos(ubigeoBean);
	}


	
	
	
	
}
