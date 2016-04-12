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
		RoomInformationViewBean roomInformationViewBean = new RoomInformationViewBean();
		
		
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
			
			
			request.setAttribute("RoomInformationViewBean", roomsInfo);
			
			
			roomInformationViewBean.setAirConditioning(roomsInfo.get(0).getAirConditioning());
			System.out.println("in servlet, putting this in view bean: " + roomInformationViewBean.getAirConditioning());			
			
			
			request.setAttribute("ac", roomInformationViewBean.getAirConditioning());
			request.getSession().setAttribute("ac", roomInformationViewBean.getAirConditioning());
			this.getServletConfig().getServletContext().setAttribute("ac", roomInformationViewBean.getAirConditioning());
			
			
			request.setAttribute("roomInformationViewBean",roomInformationViewBean );
			request.getSession().setAttribute("roomInformationViewBean",roomInformationViewBean );
			this.getServletConfig().getServletContext().setAttribute("roomInformationViewBean",roomInformationViewBean );

			
			request.setAttribute("arrayList", roomsInfo);
			
			
			request.getRequestDispatcher("/Page2.jsp").forward(request, response);


		} catch (SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//response.sendRedirect("Page2.jsp");
		
		
		/*
		request.setAttribute("roomInformationViewBean",RoomInformationViewBean );
		request.getSession().setAttribute("roomInformationViewBean",RoomInformationViewBean );
		this.getServletConfig().getServletContext().setAttribute("roomInformationViewBean",RoomInformationViewBean );
		 */

		/*
		request.setAttribute("sharedId", shared); // add to request
		request.getSession().setAttribute("sharedId", shared); // add to session
		this.getServletConfig().getServletContext().setAttribute("sharedId", shared); /

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
