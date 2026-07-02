package controller;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RoomDAO;
import dao.StudentDAO;
import model.Room;
import model.Student;
@WebServlet("/students")
public class StudentServlet extends HttpServlet{
	//add students
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		String StudentName = req.getParameter("studentName");
		String phone = req.getParameter("phone");
		int roomId =Integer.parseInt(req.getParameter("roomId"));
		
		Student student = new Student();
		student.setStudentName(StudentName);
		student.setPhone(phone);
		student.setRoomId(roomId);
		
		StudentDAO  dao = new StudentDAO();
		dao.addStudent(student);
		res.sendRedirect("students");
	}
	//display students
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		RoomDAO roomdao = new RoomDAO();
		StudentDAO dao = new StudentDAO();
		
		//load students for allocation
		//List<Student> studentList = dao.getAllStudents();
		
		//load rooms need for allovation
		List<Room> roomList = roomdao.getAllRooms();
		
		//req.setAttribute("StuentLists", studentList);
		req.setAttribute("roomList", roomList);
		req.getRequestDispatcher("Students.jsp").forward(req,res);
		
	}
	
	
	
	
	
	
	
}
