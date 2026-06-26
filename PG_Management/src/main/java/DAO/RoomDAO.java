package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Room;
import util.DBconnection;

public class RoomDAO {
 
	public int addRoom(Room room) {
		
       try {
			Connection con=DBconnection.getConnection();
			PreparedStatement pst = con.prepareStatement("Insert into room (room_number,max_capacity) VALUES(?,?)");
			pst.setString(1, room.getRoomNumber());
			pst.setInt(2,room.getMaxCapacity());
			return pst.executeUpdate();
		
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
       return 0;
		
		
	}
}
		
	

