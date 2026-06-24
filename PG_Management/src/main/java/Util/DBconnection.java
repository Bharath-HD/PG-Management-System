package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localost:3306/PG_Management",
				"root",
				"root");
		
	}
}
