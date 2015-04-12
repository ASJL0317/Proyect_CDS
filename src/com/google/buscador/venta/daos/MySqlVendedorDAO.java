package com.google.buscador.venta.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.buscador.util.ConectaDB;
import com.google.buscador.venta.bean.VendedorBean;

public class MySqlVendedorDAO implements VendedorDAO {

	@Override
	public int inserta(VendedorBean bean) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		int insertados = -1;
		try {
			String sql = "insert into tb_vendedor values(null,?,?,?,?,?,?)";
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, bean.getStrNombre());
			pstm.setString(2, bean.getStrApellido());
			pstm.setInt(3, bean.getIntEdad());
			pstm.setString(4, bean.getStrFecha());
			pstm.setString(5, bean.getStrEstado());
			pstm.setString(6, bean.getStrDistrito());
			insertados = pstm.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (pstm != null)pstm.close();
			} catch (SQLException e1) {}
			try {
				if (conn != null)conn.close();
			} catch (SQLException e) {}
		}
		return insertados;
	}

	@Override
	public int elimina(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualiza(VendedorBean bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public VendedorBean obtienePorPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VendedorBean> traeTodos() throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<VendedorBean> lista = new ArrayList<VendedorBean>();
		try {
			String sql = "select * from tb_vendedor";
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			VendedorBean bean = null;
			while(rs.next()){
				bean = new VendedorBean();
				bean.setIntCodigo(rs.getInt(1));
				bean.setStrNombre(rs.getString(2));
				bean.setStrApellido(rs.getString(3));
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
	public List<VendedorBean> buscaXEstadoCivil(String estado) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<VendedorBean> lista = new ArrayList<VendedorBean>();
		try {
			String sql = "select * from tb_vendedor where est_civ_ven=?";  
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, estado);
			rs = pstm.executeQuery();
			VendedorBean bean = null;
			while(rs.next()){
				bean = new VendedorBean();
				bean.setIntCodigo(rs.getInt(1));
				bean.setStrNombre(rs.getString(2));
				bean.setStrApellido(rs.getString(3));
				bean.setStrEstado(rs.getString(6));
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
