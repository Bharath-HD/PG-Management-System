package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RoomDAO;
import model.Room;

@WebServlet("/addRoom")
public class RoomServlet extends  HttpServlet{
	
	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException{
		String roomNumber=req.getParameter("roomNumber");
		int maxCapacity=Integer.parseInt(req.getParameter("maxCapacity"));
		
		Room room = new Room();
		room.setRoomNumber(roomNumber);
		room.setMaxCapacity(maxCapacity);
		
		
		RoomDAO dao= new RoomDAO();
		dao.addRoom(room);
		
		
	}

	
	
}
