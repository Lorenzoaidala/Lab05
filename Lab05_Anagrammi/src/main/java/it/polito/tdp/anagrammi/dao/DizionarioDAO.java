package it.polito.tdp.anagrammi.dao;
import java.sql.*;
import java.util.*;

public class DizionarioDAO {
	

	public List<String> getParoleCorrette(){
		List<String> paroleCorrette = new ArrayList<String>();
		String sql ="SELECT nome FROM parola ";
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				paroleCorrette.add(rs.getString("nome"));
			}
			conn.close();
			return paroleCorrette;
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Connessione fallita", e);
		}
	}
}
