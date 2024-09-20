package com.training.example.q36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCPractice {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employee", "root",
				"root");
		
		PreparedStatement ps = con.prepareStatement("insert into tbl_employee values (?,?,?,?)");
		ps.setInt(1, 5);
		ps.setString(2, "vru");
		ps.setString(3, "B");
		ps.setString(4, "c@gmail.com");

		int result = ps.executeUpdate();
		System.out.println("Inserted records " + result);
		PreparedStatement psSelect = con.prepareStatement("SELECT * FROM tbl_employee");
		ResultSet rs = psSelect.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString("firstname") + " " + rs.getString("lastname") + " "
					+ rs.getString("email"));
		}

		
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

		PreparedStatement psDelete = con.prepareStatement("delete from tbl_employee where id=?");
		psDelete.setInt(1, 4);
		int deleteResult = psDelete.executeUpdate();
		System.out.println("\nDeleted records " + deleteResult);
	}

}
