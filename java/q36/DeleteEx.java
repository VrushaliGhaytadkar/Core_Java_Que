package com.training.example.q36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeleteEx {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employee", "root",
				"root");
		
		PreparedStatement psDelete = con.prepareStatement("delete from tbl_employee where id=?");
		psDelete.setInt(1, 4);
		int deleteResult = psDelete.executeUpdate();
		System.out.println("\nDeleted records " + deleteResult);
		con.close();
	}

}
