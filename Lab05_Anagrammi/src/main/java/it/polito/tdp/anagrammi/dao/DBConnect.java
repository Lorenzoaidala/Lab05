package it.polito.tdp.anagrammi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	static private final String jdbcURL = "jdbc:mysql://localhost/dizionario?user=root&password=Lollolol98";
	
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(jdbcURL);
			return connection;
			
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(" Can't get a connection"+ jdbcURL, e);
		}
	}
}
