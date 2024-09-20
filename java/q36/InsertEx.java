package com.training.example.q36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertEx {
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employee", "root","root");
	
	PreparedStatement ps = con.prepareStatement("insert into tbl_employee values (?,?,?,?)");
	ps.setInt(1,4);
	ps.setString(2, "vru");
	ps.setString(3, "B");
	ps.setString(4, "c@gmail.com");

	int result = ps.executeUpdate();
	System.out.println("Inserted records " + result);
	PreparedStatement psSelect = con.prepareStatement("SELECT * FROM tbl_employee");
	ResultSet rs = psSelect.executeQuery();
	while (rs.next()) {
		System.out.println(rs.getInt("id") + " " + rs.getString("firstname") + " " + rs.getString("lastname") + " "	+ rs.getString("email"));
	}
	con.close();

}
}