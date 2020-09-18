package mybuspak;

import java.sql.*;
public class DBConnection
{
	public static Connection con;
	public static Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Ok");
			con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/bus",
			"root",
			"prince");
			System.out.println("Connected");
		}
		catch(ClassNotFoundException|SQLException se) {
			se.printStackTrace();
		}
		return con;
	}
	public static void main(String ar[]) {
		connect();
	}
}
