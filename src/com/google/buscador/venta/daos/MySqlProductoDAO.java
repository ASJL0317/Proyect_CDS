package com.google.buscador.venta.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.buscador.util.ConectaDB;
import com.google.buscador.venta.bean.ProductoBean;


public class MySqlProductoDAO implements ProductoDAO{

	@Override
	public List<ProductoBean> lista() throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<ProductoBean> lista = new ArrayList<ProductoBean>();
		try {
			String sql = "select * from tb_producto";
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			ProductoBean bean = null;
			while(rs.next()){
				bean = new ProductoBean();
				bean.setIdCodigo(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				bean.setPrecio(rs.getDouble(3));
				bean.setStock(rs.getInt(4));
				bean.setCategoria(rs.getString(5));
				bean.setFecha(rs.getString(6));
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

	@Override
	public List<ProductoBean> buscaXprecio(double p1, double p2)
			throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<ProductoBean> lista = new ArrayList<ProductoBean>();
		try {
			String sql = "select * from tb_producto where pre_pro between ? and ?";
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			pstm.setDouble(1, p1);
			pstm.setDouble(2, p2);
			rs = pstm.executeQuery();
			ProductoBean bean = null;
			while(rs.next()){
				bean = new ProductoBean();
				bean.setIdCodigo(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				bean.setPrecio(rs.getDouble(3));
				bean.setStock(rs.getInt(4));
				bean.setCategoria(rs.getString(5));
				bean.setFecha(rs.getString(6));
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
