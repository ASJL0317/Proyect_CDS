package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.SedeBean;

public interface SedeDAO {

	public abstract List<SedeBean> buscaXdistrito(String distrito) throws Exception;
	
}
