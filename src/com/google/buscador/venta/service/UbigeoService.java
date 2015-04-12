package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.UbigeoBean;

public interface UbigeoService {
	public abstract List<UbigeoBean> traeDepartamentos() throws Exception;
	public abstract List<UbigeoBean> traeProvincias(UbigeoBean ubigeoBean) throws Exception;
	public abstract List<UbigeoBean> traeDistrito(UbigeoBean ubigeoBean) throws Exception;
	
}
