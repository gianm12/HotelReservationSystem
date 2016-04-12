package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Objects.RoomInformation;

public class AvailableRoomsDAO {
	public static ArrayList<RoomInformation> availableRooms() throws SQLException{
		System.out.println("Inside AvailableRoomsDAO");

		//	RoomInformation[] roomInfo = new RoomInformation[50];
		RoomInformation roomInfo = new RoomInformation();
		ArrayList<RoomInformation> allRoomsInformation = new ArrayList<RoomInformation>();
		ResultSet rs = processQuery();


		while(rs.next()){
			//Must instantiate roomInfo every time it loops, otherwise the arrayList will only contain the last instance of roomInfo
			roomInfo = new RoomInformation();

			roomInfo.setTransactionNumber(rs.getInt("TRANSACTION_NUMBER"));
			roomInfo.setRoomNumber(rs.getInt("ROOM_NUMBER"));
			roomInfo.setClimateControl(rs.getString("CLIMATE_CONTROL"));
			roomInfo.setDvdPlayer(rs.getString("DVD_PLAYER"));
			roomInfo.setWIFI(rs.getString("WIFI"));
			roomInfo.setInRoomSafe(rs.getString("IN_ROOM_SAFE"));
			roomInfo.setAirConditioning(rs.getString("AIR_CONDITIONING"));
			roomInfo.setDateBookedStart(rs.getDate("DATE_BOOKED_START"));
			roomInfo.setDateBookedEnd(rs.getDate("DATE_BOOKED_END"));
			roomInfo.setBedType(rs.getString("BED_TYPE"));
			roomInfo.setNumberOfBeds(rs.getInt("NUMBER_OF_BEDS"));
			roomInfo.setPriceOfRoom(rs.getInt("PRICE_OF_ROOM"));
			roomInfo.setSmoking(rs.getString("SMOKING"));
			roomInfo.setPatioView(rs.getString("PATIO_VIEW"));
			roomInfo.setMiniFridge(rs.getString("MINI_FRIDGE"));
			roomInfo.setExtraFeatures(rs.getString("EXTRA_FEATURES"));
			allRoomsInformation.add(roomInfo);
		}


		//		System.out.println("this is the first room: " +allRoomsInformation.get(0).getRoomNumber());
		//		System.out.println("this is the second room: " +allRoomsInformation.get(1).getRoomNumber());
		//		System.out.println("this is the third room: " +allRoomsInformation.get(2).getRoomNumber());
		//how to change data type of query

		return allRoomsInformation;
	}

	public static ResultSet processQuery() 
	{
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/availableroomsdb", "student", "student");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("database connection successfsul!");

		try {
			myStmt= myConn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			myRs= myStmt.executeQuery("select * from AVAILABLE_ROOMS");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myRs;
	}

}
