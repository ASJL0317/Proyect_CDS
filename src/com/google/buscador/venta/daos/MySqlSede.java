package com.google.buscador.venta.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.buscador.util.ConectaDB;
import com.google.buscador.venta.bean.SedeBean;

public class MySqlSede implements SedeDAO {

	@Override
	public List<SedeBean> buscaXdistrito(String distrito) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<SedeBean> lista = new ArrayList<SedeBean>();
		try {
			String sql = "select * from tb_sede where dis_sed=?";  
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, distrito);
			rs = pstm.executeQuery();
			SedeBean bean = null;
			while(rs.next()){
				bean = new SedeBean();
				bean.setCodSede(rs.getInt(1));
				bean.setNomSede(rs.getString(2));
				bean.setDirSede(rs.getString(3));
				bean.setFechaSede(rs.getString(4));
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
