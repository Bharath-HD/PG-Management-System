package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Room;
import util.DBconnection;

public class RoomDAO {
 
	public int addRoom(Room room) 
	{
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
	public List<Room> getAllRooms () 
	{
		List<Room> roomList = new ArrayList<>();
		String sql="select * from room";
		try (
			Connection con = DBconnection.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			){
			while(rs.next()) {
				Room room = new Room();
				room.setRoomId(rs.getInt("room_id"));
				room.setRoomNumber(rs.getString("room_number"));
				room.setMaxCapacity(rs.getInt("max_capacity"));
				roomList.add(room);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return roomList;
	}
	public boolean deleteRoom(int roomId) {
		
		String sql = "delete from room where room_id=?";
		
		try(
			Connection con = DBconnection.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
				){
			pst.setInt(1,roomId);
			return pst.executeUpdate()>0;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
		
	

