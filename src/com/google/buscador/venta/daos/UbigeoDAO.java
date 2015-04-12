package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.UbigeoBean;

public interface UbigeoDAO {

	
	
	public abstract List<UbigeoBean> traeDepartamentos() throws Exception;
	public abstract List<UbigeoBean> traeProvincias(UbigeoBean ubigeoBean) throws Exception;
	public abstract List<UbigeoBean> traeDistritos(UbigeoBean ubigeoBean) throws Exception;

}
