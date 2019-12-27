package com.khrd.ex00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class MySqlConnectionTest {
	private static final String Driver = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex";
	private static final String user = "root";
	private static final String password = "rootroot";
	
	@Test
	public void testConnection() throws ClassNotFoundException, SQLException {
		Class.forName(Driver);
		Connection conn = null; //java.sql
		
		try {
			conn = DriverManager.getConnection(URL, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				conn.close();
			}
		}
	}
}
