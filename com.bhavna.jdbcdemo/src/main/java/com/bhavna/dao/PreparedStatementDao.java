package com.bhavna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bhavna.utility.MyConnection;

public class PreparedStatementDao {

	public static void addData() {
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();			
			PreparedStatement stmt = connection.prepareStatement("insert into company values(?,?,?,?,?)");
			stmt.setInt(1, 109);
			stmt.setString(2, "Samsung");
			stmt.setDouble(3, 987000);
			stmt.setString(4, "Pune");
			stmt.setString(5, "2010-07-10");
			int i =stmt.executeUpdate();
			
			System.out.println("Inserted");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public static void updateData() {
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement("update company set companyname =? where companyId =?");
			stmt.setString(1, "Oracle");
			stmt.setInt(2, 105);
			int i =stmt.executeUpdate();
			
			System.out.println("updated");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static void deleteData() {
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement("delete from company where companyId =?");
			stmt.setInt(1, 107);
			int i =stmt.executeUpdate();			
			System.out.println("deleted");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
