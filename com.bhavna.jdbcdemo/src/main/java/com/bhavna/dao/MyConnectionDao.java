package com.bhavna.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bhavna.bean.Company;
import com.bhavna.utility.MyConnection;

public class MyConnectionDao {

	public static void addData(Company company) {
		Connection connection = null;
		Statement stmt = null;
		try {
			connection = MyConnection.getConnection();
			stmt = connection.createStatement();
			String q1 = "insert into company values('" + company.getId() + "', '" + company.getCompany() + "', '"
					+ company.getTurn_over() + "', '" + company.getAddress() + "', '" + company.getEstablishment()
					+ "')";
			int x = stmt.executeUpdate(q1);
			if (x > 0) {
				System.out.println("record inserted");
			} else {
				System.out.println("Not inserted");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void viewData() {
		Connection connection = null;
		Statement stmt = null;
		try {
			connection = MyConnection.getConnection();
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from company");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getDouble(3) + " "
						+ rs.getString(4) + " " + rs.getString(5));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
