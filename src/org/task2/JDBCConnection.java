package org.task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.checkerframework.common.reflection.qual.ForName;

public class JDBCConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, Throwable {
		
		Class.forName("com.oracle.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","username","password");
		Statement state = con.createStatement();
		ResultSet result = state.executeQuery("SELECT COUNT(CustomerID), Country FROM Customers\r\n"
				+ "    GROUP BY Country;");
		
		while (result.next()) {
			
			String value = result.getString(1);
			System.out.println(value);
			
		}
		
	}
	

}
