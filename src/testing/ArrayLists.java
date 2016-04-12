
package testing;

import java.util.ArrayList;

import Objects.RoomInformation;

public class ArrayLists {
public static void main(String[] args) {
	
	
	RoomInformation availableRooms = new RoomInformation();
	ArrayList<RoomInformation> al	= new ArrayList<RoomInformation>();
	
//	Date dateBooked = new Date();
	for(int i=10; i<13; i++){
		availableRooms = new RoomInformation();
		System.out.println("inside for loop");
		availableRooms.setBedType(i+10+ "King");
		availableRooms.setPatioView("yes");
		availableRooms.setPriceOfRoom(66.99);
		availableRooms.setTypeOfRoom("Deluxe");
		
		al.add(availableRooms);
		
		System.out.println("end of for loop");
	}
int i =0;
	for (RoomInformation roomInformation : al) {
		
		System.out.println("i: "+ roomInformation.getBedType());
		i++;
	}
	
	
}
}
