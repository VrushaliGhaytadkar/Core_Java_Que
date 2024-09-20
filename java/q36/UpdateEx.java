package com.training.example.q36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateEx {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employee", "root","root");
		
		PreparedStatement psUpdate = con.prepareStatement("update tbl_employee set lastname=? where id=?");
		psUpdate.setString(1, "Ghay");
		psUpdate.setInt(2, 4);
		int rsUpdate = psUpdate.executeUpdate();
		System.out.println("\nUpdate records " + rsUpdate);
		PreparedStatement psUpdatedRecords = con.prepareStatement("select * from tbl_employee where id=?");
		psUpdatedRecords.setInt(1, 4);// for id
		ResultSet resultUpdated = psUpdatedRecords.executeQuery();

		if (resultUpdated.next()) {
			System.out.println(resultUpdated.getInt("id") + " " + resultUpdated.getString("firstname") + " "
					+ resultUpdated.getString("lastname"));
		}
		con.close();
	}
}