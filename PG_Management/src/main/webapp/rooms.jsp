<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Room" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Room Management</title>
</head>
<body>
 <form action="rooms" method="post">
 RoomNuumber
 <input type="Number"  name="roomNumber" required >
 <br><br>
 Maximum Capacity
 <input type="number" name="maxCapacity" required>
 <br><br>
 <input type="submit" value="rooms">
 </form>
 
 <hr>
 <h2>Available rooms</h2>
 <table>
 <tr>
 <th>Room Id</th>
 <th>Room Number</th>
 <th>Capacity</th>
 <th>Action</th>
 </tr>
 
 <% 
 List<Room> roomList = (List<Room>)request.getAttribute("roomList");
 if(roomList != null){
 for(Room room :roomList) {
 %>
 
 <tr>
 <td><%=room.getRoomId()%></td>
 <td><%=room.getRoomNumber()%></td>
 <td><%=room.getMaxCapacity()%></td>
 
 <td>
 <a href="RoomServlet?action=delete&id=<%=room.getRoomId()%>">Delete</a>
 
 </td>
 </tr>
 <%
}
 }
%>
 </table>
</body>
</html>

