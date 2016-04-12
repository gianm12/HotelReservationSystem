<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="Objects.RoomInformationViewBean"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>In page 2</title>
</head>
<body>

	<h1>Inside Page 2!!!</h1>


	<%
	RoomInformationViewBean roomsAvailable = (RoomInformationViewBean) request.getAttribute("roomInformationViewBean)");
		out.println("whole obj: " + roomsAvailable);
	%>

	<%
		String bedType = (String) request.getAttribute("roomBedTypes");
		out.println("bed type: " + bedType);
	%>



</body>
</html>