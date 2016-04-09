package Reservation;

import Objects.Date;
import Objects.RoomInformation;

public class AvailableRooms {
	public static void main(String[] args) {


		populateRoomInformation();
		
	}

	public static void populateRoomInformation() {
		RoomInformation[] availableRooms = new RoomInformation[3];
		
		System.out.println(availableRooms.length);
		Date date = new Date();
		
		for(int i=0; i<availableRooms.length;i++){
			availableRooms[i]= new RoomInformation();
			System.out.println("inside for loop");
			availableRooms[i].setBedType("1 King");
			System.out.println("1");
			date.setWholeDate("02/12/2016");
			availableRooms[i].setAvailableDate(date);
			System.out.println("2");
			date.setWholeDate("02/25/2016");
			availableRooms[i].setDatebooked(date);
			availableRooms[i].setPatioView(true);
			availableRooms[i].setPriceOfRoom(66.99);
			availableRooms[i].setTypeOfRoom("Deluxe");
			System.out.println("end of for loop");
		}
		
		availableRooms[0].setPriceOfRoom(67.90);
		System.out.println(availableRooms[0].getDatebooked());
		System.out.println("availble room date that is booked " + availableRooms[0].getAvailableDate());				
	}
	
}
