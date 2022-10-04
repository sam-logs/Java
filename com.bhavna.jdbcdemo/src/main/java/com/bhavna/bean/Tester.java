package com.bhavna.bean;

import com.bhavna.dao.MyConnectionDao;
import com.bhavna.utility.MyConnection;

public class Tester {
	public static void main(String[] args) {
		//Company employee2 = new Company(108, "Apple", 908820, "Banglore", "2013-10-09");
		MyConnection.getConnection();
		//MyConnectionDao.addData(employee2);
		//MyConnectionDao.viewData();
		PreparedStatementDao.addData();
		//PreparedStatementDao.updateData();
		//PreparedStatementDao.deleteData();
		
	}

}
