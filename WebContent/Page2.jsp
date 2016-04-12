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
		//	String shared = (String) request.getAttribute("ac");
		//String shared1 = (String) request.getSession().getAttribute("ac");
		//String shared2 = (String) this.getServletConfig().getServletContext().getAttribute("ac");
	%>

	<%
		ArrayList<RoomInformationViewBean> roomInformationViewBeanArrayList = (ArrayList<RoomInformationViewBean>) request.getAttribute("RoomInformationViewBeanArrayList");
		for (RoomInformationViewBean availableRoomInfo : roomInformationViewBeanArrayList) {
			out.println("Bed type: " + (String) availableRoomInfo.getBedType());
			out.println("Room Number: " + (Integer) availableRoomInfo.getRoomNumber() );
			out.println("Transaction Number: " + (Integer) availableRoomInfo.getTransactionNumber());
			out.println("Size of Room: " + (Integer) availableRoomInfo.getSizeOfRoom());
			out.println("Price of Room: " + (Double) availableRoomInfo.getPriceOfRoom());
		}
	%>


</body>
</html>