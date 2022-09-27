package com.bhavna.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String connectionString = "jdbc:mysql://localhost:3306/dbcompany?characterEncoding=utf8";

			connection = DriverManager.getConnection(connectionString, "root", "Bhavna@123");

		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}

}
