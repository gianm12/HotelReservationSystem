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

<a href = "Page2.jsp">View all available rooms</a> </br>



Rooms: </br>
<select>
<option value ="onePerson"> 1</option>
<option value="twoPeople"> 2</option>
<option value ="threePeople">3</option>
<option value = "fourPeople">4</select>
</select> </br>


<input type="submit" value ="View available rooms" name= "Page2.jsp"></br>

<input type="submit" value="View All Available Rooms"> </br>

</form>
</div>





</body>
</html>