package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.SedeBean;

public interface SedeService {
	
	public abstract List<SedeBean> listaXdistrito(String distrito) throws Exception;

}
