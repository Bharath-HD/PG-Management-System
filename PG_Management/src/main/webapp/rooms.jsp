<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Room Management</title>
</head>
<body>
 <form action="addRoom" method="post">
 RoomNuumber
 <input type="Number"  name="roomNumber" required >
 <br><br>
 Maximum Capacity
 <input type="number" name="maxCapacity" required>
 <br><br>
 <input type="submit" value="addRoom">
 </form>
</body>
</html>