<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Hotel Reservation System</h1>

<div>
<form action= "AvailableRooms_Servlet" method="get">

Enter the start date:
<input type= "date" name= "startDate" > </input> <br>

Enter the end date:
<input type = "date" name ="endDate"> </input> <br>

<a href = "Page2.jsp">View all available rooms</a>

<input type="submit" value ="View all available rooms" name= "Page2.jsp">

<input type="submit" value="View All Available Rooms">

</form>
</div>





</body>
</html>