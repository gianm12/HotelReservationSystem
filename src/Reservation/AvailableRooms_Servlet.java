package Reservation;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Objects.RoomInformation;
import Objects.RoomInformationViewBean;

/**
 * Servlet implementation class AvailableRooms_Servlet
 */
@WebServlet("/AvailableRooms_Servlet")
public class AvailableRooms_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object RoomInformationViewBean;

	/**
	 * Default constructor. 
	 */
	
	public AvailableRooms_Servlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param RoomInformationViewBean 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("\n /n \n           asdfasdf             inside servlet!");
		System.out.println("inside servlet!");		
		try {
			retrievePageParameters(request, response);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String startDateString =  request.getParameter("startDate");
			System.out.println("servlet - this is the start date: "+ startDateString);
			Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDateString);
			java.sql.Date startDateSQL = new java.sql.Date(startDate.getTime());
			
			String endDateString = request.getParameter("endDate");
			System.out.println("servlet - this is the start date: "+ endDateString);
			java.util.Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(endDateString);
			java.sql.Date endDateSQL = new java.sql.Date(endDate.getTime());
			

			ArrayList<RoomInformationViewBean> roomsInfo = AvailableRooms.allRoomAvailable(startDateSQL, endDateSQL);
			
			request.setAttribute("RoomInformationViewBeanArrayList", roomsInfo);
			request.getRequestDispatcher("/Page2.jsp").forward(request, response);

		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}


		//response.sendRedirect("Page2.jsp");
		
		/*
		request.setAttribute("roomInformationViewBean",RoomInformationViewBean );
		request.getSession().setAttribute("roomInformationViewBean",RoomInformationViewBean );
		this.getServletConfig().getServletContext().setAttribute("roomInformationViewBean",RoomInformationViewBean );
		 */
		
	}

	private void retrievePageParameters(HttpServletRequest request, HttpServletResponse response) throws ParseException {
		/*
		 * Add this in this function later and remove from the doGet
		String startDateString =  request.getParameter("startDate");
		System.out.println("servlet - this is the start date: "+ startDateString);
		Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDateString);
		java.sql.Date startDateSQL = new java.sql.Date(startDate.getTime());
		
		String endDateString = request.getParameter("endDate");
		System.out.println("servlet - this is the start date: "+ endDateString);
		java.util.Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(endDateString);
		java.sql.Date endDateSQL = new java.sql.Date(endDate.getTime());
		
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
