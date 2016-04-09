package Objects;

public class RoomsEnum {
	public enum Rooms {
		LUXURY_ROOM, BASIC_ROOM, DELUXE_ROOM;
	}
	Rooms room;

	public RoomsEnum(Rooms room) {
		this.room = room;
	}

	public void getSelectedRoom(){
		
		switch(room){
		case LUXURY_ROOM:
			System.out.println("1 CA King size bed with mini fridge. Non-smoking");
			break;
		case DELUXE_ROOM:
			System.out.println("2 Queen size beds mini fridge. Non-smoking");
			break;
		case BASIC_ROOM:
			System.out.println("1 Queen sized bed, no mini fridge. Smoking");
			break;
		}
	}
}
