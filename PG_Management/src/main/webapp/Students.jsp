<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="model.Room" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
</head>
<body>
<form action="students" method="post">
Student Name:
<input type="text" name="studentName" required>
<br><br>
Contact Number:
<input type="text" name="phone" required>
<br><br>
Allocate Room:
<select name="roomId">

<%
  List<Room> roomList = (List<Room>)request.getAttribute("roomList");
   if(roomList != null){
	   for(Room room : roomList){
%>

<option value="<%=room.getRoomId()%>">


Room<%=room.getRoomNumber() %>
</option>

<%
    }
}
%>
</select>
<br><br>
<input type="submit" value="Add Student">

</form>

</body>
</html>