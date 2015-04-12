package com.google.buscador.venta.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.buscador.util.ConectaDB;
import com.google.buscador.venta.bean.UbigeoBean;

public class MySqlUbigeo implements UbigeoDAO{


	public List<UbigeoBean> traeDepartamentos() throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<UbigeoBean> lista = new ArrayList<UbigeoBean>();
		try {
			String sql = "select  distinct departamento from ubigeo";
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			UbigeoBean bean = null;
			while(rs.next()){
				bean = new UbigeoBean();
				bean.setIdDepartamento(rs.getString(1));
				bean.setDepartamento(rs.getString(1));
				lista.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstm != null)pstm.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {}
		}
		return lista;
	}
	
	public List<UbigeoBean> traeProvincias(UbigeoBean ubigeoBean) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<UbigeoBean> lista = new ArrayList<UbigeoBean>();
		try {
			String sql = 
			"select  distinct provincia from ubigeo where departamento=?";
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, ubigeoBean.getIdDepartamento());
			rs = pstm.executeQuery();
			UbigeoBean bean = null;
			while(rs.next()){
				bean = new UbigeoBean();
				bean.setIdProvincia(rs.getString(1));
				bean.setProvincia(rs.getString(1));
				lista.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstm != null)pstm.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {}
		}
		return lista;
	}
	
	public List<UbigeoBean> traeDistritos(UbigeoBean ubigeoBean) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<UbigeoBean> lista = new ArrayList<UbigeoBean>();
		try {
			String sql = 
			"select  distinct id,distrito from ubigeo where " +
			" departamento =? and provincia=?";
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, ubigeoBean.getIdDepartamento());
			pstm.setString(2, ubigeoBean.getIdProvincia());
			rs = pstm.executeQuery();
			UbigeoBean bean = null;
			while(rs.next()){
				bean = new UbigeoBean();
				bean.setIdDistrito(rs.getString(1));
				bean.setDistrito(rs.getString(2));
				lista.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstm != null)pstm.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {}
		}
		return lista;
	}
	
}
