package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.DBconnection;

public class AdminDAO {
	public boolean validateAdmin(String username,String password) {
		try {
			Connection con = DBconnection.getConnection();
			PreparedStatement pst=	con.prepareStatement("select * from Admin where username=? and password=?");
			pst.setString(1,username);
			pst.setString(2,password);
			
			ResultSet rs = pst.executeQuery();
			 return rs.next();
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return false;
	}
	
 
}





