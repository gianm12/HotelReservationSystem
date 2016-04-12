<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="Objects.RoomInformationViewBean"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Objects.RoomInformation"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>In page 2</title>
</head>
<body>

	<h1>Inside Page 2!!!</h1>
	<jsp:useBean id="roomInformationViewBean"
		class="Objects.RoomInformationViewBean" scope="request">

	</jsp:useBean>



	AC:
	<%
		String shared = (String) request.getAttribute("ac");
		String shared1 = (String) request.getSession().getAttribute("ac");
		String shared2 = (String) this.getServletConfig().getServletContext().getAttribute("ac");
	%>
	<%
		out.println(shared);
	%></br> whole object:
	<%
		RoomInformationViewBean obj = (RoomInformationViewBean) request.getAttribute("roomInformationViewBean");
		RoomInformationViewBean obj1 = (RoomInformationViewBean) request.getSession()
				.getAttribute("roomInformationViewBean");
		RoomInformationViewBean obj2 = (RoomInformationViewBean) this.getServletConfig().getServletContext()
				.getAttribute("roomInformationViewBean");

		out.println("whole object: " + obj);
	%></br> getting the ac from object:
	<%
		String ac = obj.getAirConditioning();
		out.println("this is the ac from object: " + ac);
	%>

	</br>

	<%
		RoomInformationViewBean rooms = (RoomInformationViewBean) request.getAttribute("roomInformationViewBean");
		out.println("new try: " + rooms.getAirConditioning());
	%>
	</br>
	<%
		ArrayList<RoomInformation> arrayListRoomsAvailable = (ArrayList<RoomInformation>) request.getAttribute("arrayList");
	%>

	<%
		for (RoomInformation roomsAvailable : arrayListRoomsAvailable) {
			out.println("Type of bed: " + (String) roomsAvailable.getBedType() + "\n");
			out.println("\n");
			out.println("Mini Fridge: " + roomsAvailable.getMiniFridge());
			out.println("\n");
			out.println("number of room: " + (Integer) roomsAvailable.getRoomNumber() + "\n");
			out.println("\n");

		}
	%>
	
	<%
	for (RoomInformation roomsAvailable : arrayListRoomsAvailable) {
		out.println("Room Number: " + roomsAvailable.getRoomNumber());
		out.println("Transaction Number: " + roomsAvailable.getTransactionNumber());
	}
	
	
	%>
	
	<%if(rooms.getIsRoomAvailable())
		
		
		
		
	%>


















</body>
</html>