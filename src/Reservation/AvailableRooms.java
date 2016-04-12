package Reservation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.AvailableRoomsDAO;
import Objects.Date;
import Objects.RoomInformation;
import Objects.RoomInformationViewBean;

public class AvailableRooms {

	public static ArrayList<RoomInformationViewBean> allRoomAvailable(java.sql.Date startDate, java.sql.Date endDate) throws SQLException {
		/*
		RoomInformation[] availableRooms = new RoomInformation[3];
		System.out.println(availableRooms.length);
		Date date = new Date();
		Date dateBooked = new Date();
		for(int i=0; i<availableRooms.length;i++){
			availableRooms[i]= new RoomInformation();
			System.out.println("inside for loop");
			availableRooms[i].setBedType("1 King");
			System.out.println("1");
			date.setWholeDate("02/12/2016");
			availableRooms[i].setAvailableDate(date);
			System.out.println("2");
			dateBooked.setWholeDate("02/25/2016");
			availableRooms[i].setDatebooked(dateBooked);
			availableRooms[i].setPatioView(true);
			availableRooms[i].setPriceOfRoom(66.99);
			availableRooms[i].setTypeOfRoom("Deluxe");
			System.out.println("end of for loop");
		}
		availableRooms[0].setPriceOfRoom(67.90);
		System.out.println(availableRooms[0].getDatebooked());
		System.out.println("available room date that is booked " + availableRooms[0].getAvailableDate());				
		 */
		System.out.println("...............inside availableRooms.java...........................");
		ArrayList<RoomInformation> allRoomsInformation = AvailableRoomsDAO.availableRooms();
		
		RoomInformationViewBean roomInformationViewBean = new RoomInformationViewBean();
		ArrayList<RoomInformationViewBean> roomInformationViewBeanArrayList = new ArrayList<RoomInformationViewBean>();
		
		for (RoomInformation roomInformation : allRoomsInformation) {
			if(checkForAvailability(roomInformation, startDate, endDate))
			{
				roomInformationViewBeanArrayList = new ArrayList<RoomInformationViewBean>();
				System.out.println("Room is available in the if statement...");
				roomInformationViewBean.setIsRoomAvailable(roomInformation.getIsRoomAvailable());
				System.out.println("Transaction Number: " +roomInformation.getTransactionNumber());
				roomInformationViewBean.setTransactionNumber(roomInformation.getTransactionNumber());
				System.out.println("Room Number: " + roomInformation.getRoomNumber());
				roomInformationViewBean.setRoomNumber(roomInformation.getRoomNumber());
				System.out.println("Climate Control: " +roomInformation.getClimateControl());
				roomInformationViewBean.setClimateControl(roomInformation.getClimateControl());
				System.out.println("DVD Player: " + roomInformation.getDvdPlayer());
				roomInformationViewBean.setDvdPlayer(roomInformation.getDvdPlayer());
				System.out.println("WIFI: " +roomInformation.getWIFI());
				roomInformationViewBean.setWIFI(roomInformation.getWIFI());
				System.out.println("In Room Safe: " + roomInformation.getInRoomSafe());
				roomInformationViewBean.setInRoomSafe(roomInformation.getInRoomSafe());
				System.out.println("Air Conditioning: " + roomInformation.getAirConditioning());
				roomInformationViewBean.setAirConditioning(roomInformation.getAirConditioning());
				System.out.println("Date Booked started: " + roomInformation.getDateBookedStart());
				roomInformationViewBean.setDateBookedStart(roomInformation.getDateBookedStart());
				System.out.println("Date Booked End: " + roomInformation.getDateBookedEnd());
				roomInformationViewBean.setDateBookedEnd(roomInformation.getDateBookedEnd());
				System.out.println("BedType: " + roomInformation.getBedType());
				roomInformationViewBean.setBedType(roomInformation.getBedType());
				System.out.println("Number of Beds: " +roomInformation.getNumberOfBeds());
				roomInformationViewBean.setNumberOfBeds(roomInformation.getNumberOfBeds());
				System.out.println("Price of Room: " + roomInformation.getPriceOfRoom());
				roomInformationViewBean.setPriceOfRoom(roomInformation.getPriceOfRoom());
				System.out.println("Smoking: " + roomInformation.getSmoking());
				roomInformationViewBean.setSmoking(roomInformation.getSmoking());
				System.out.println("Patio View: " +roomInformation.getPatioView());
				roomInformationViewBean.setPatioView(roomInformation.getPatioView());
				System.out.println("Mini Fridge: " + roomInformation.getMiniFridge());
				roomInformationViewBean.setMiniFridge(roomInformation.getMiniFridge());
				System.out.println("Extra Features: " + roomInformation.getExtraFeatures());
				roomInformationViewBean.setExtraFeatures(roomInformation.getExtraFeatures());
				System.out.println("---------------------------------------------------");
				roomInformationViewBeanArrayList.add(roomInformationViewBean);
			}
			else
			{
				System.out.println("Dates selected are not available");
				System.out.println("---------------------------------------------------");
			}
		}
		return roomInformationViewBeanArrayList;
	}

	private static Boolean checkForAvailability(RoomInformation roomInformation, java.sql.Date startDate, java.sql.Date endDate) {
		
		roomInformation.setIsRoomAvailable(checkdate(roomInformation.getDateBookedStart(), roomInformation.getDateBookedEnd(), startDate, endDate));
		return roomInformation.getIsRoomAvailable();
	}
	private static Boolean checkdate(java.sql.Date dateBookedStart, java.sql.Date dateBookedEnd, java.sql.Date startDate, java.sql.Date endDate) {
		Boolean isDateAvailable;
		System.out.println("Inside Check Date function................");
		/*
		 * Example Date: 2/5/2016 - 2/20/2016
		 * 
		 * Cases:
		 * 1. 1/3/16 - 1/5/16  -> T&&T -> Available
		 * 2. 2/8/16 - 3/1/16 -> F&&T -> Not Available
		 * 3. 2/8/16 - 2/15/16 -> F&&F -> Not Available
		 * 4. 1/3/16 - 2/6/16 - > T&&F -> Not Available
		 * 5. 3/10/16 - 3/15/16 -> T&&F -> Available
		 */

		isDateAvailable = ((startDate.before(dateBookedStart) || startDate.after(dateBookedEnd)) && (endDate.before(dateBookedStart) || endDate.after(dateBookedEnd)));
		if(isDateAvailable)
		{
			System.out.println("room is available!! Returning this: " + isDateAvailable);
			return isDateAvailable;
		}
		else
		{
			System.out.println("Room NOT available!!!!!! Returning this: " + isDateAvailable);
			return isDateAvailable;
		}

	}







}