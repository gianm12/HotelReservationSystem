package Objects;

public class RoomInformation {
	private int sizeOfRoom;
	private int numberOfBeds;
	private double priceOfRoom=0.00;
	private String smoking;
	private String patioView;
	private String miniFridge;
	private Date dateBooked; //instead of having the Data object here, in the setter or getter call the Date object to put it in the right format
	private boolean isbooked;
	private Date availableDate;
	private String bedType;
	private String typeOfRoom;
	private String typeOfBath;
	private String extraFeatures;
	//Update 4/9/16
	private int roomNumber;
	private String climateControl;
	private String dvdPlayer;
	private String WIFI;
	private String inRoomSafe;
	private String airConditioning;
	private java.sql.Date dateBookedStart;
	private java.sql.Date dateBookedEnd;
	private int transactionNumber;
	//end of update 4/9/16
	//Update 4/11/16
	private Boolean isRoomAvailable;
	//end of update 4/11/16
	
	public int getSizeOfRoom() {
		return sizeOfRoom;
	}
	public void setSizeOfRoom(int sizeOfRoom) {
		this.sizeOfRoom = sizeOfRoom;
	}
	public int getNumberOfBeds() {
		return numberOfBeds;
	}
	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}
	public double getPriceOfRoom() {
		return priceOfRoom;
	}
	public void setPriceOfRoom(double priceOfRoom) {
		this.priceOfRoom = priceOfRoom;
	}
	public String getSmoking() {
		return smoking;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public String getPatioView() {
		return patioView;
	}
	public void setPatioView(String patioView) {
		this.patioView = patioView;
	}
	public String getMiniFridge() {
		return miniFridge;
	}
	public void setMiniFridge(String miniFridge) {
		this.miniFridge = miniFridge;
	}
	public boolean isIsbooked() {
		return isbooked;
	}
	public void setIsbooked(boolean isbooked) {
		this.isbooked = isbooked;
	}
	public String getAvailableDate() {
		return availableDate.getWholeDate();
		
	}
	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	public String getBedType() {
		return bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}
	public String getTypeOfBath() {
		return typeOfBath;
	}
	public void setTypeOfBath(String typeOfBath) {
		this.typeOfBath = typeOfBath;
	}
	public String getExtraFeatures() {
		return extraFeatures;
	}
	public void setExtraFeatures(String extraFeatures) {
		this.extraFeatures = extraFeatures;
	}
	public Date getDateBooked() {
		return dateBooked;
	}
	public void setDateBooked(Date dateBooked) {
		this.dateBooked = dateBooked;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getClimateControl() {
		return climateControl;
	}
	public void setClimateControl(String climateControl) {
		this.climateControl = climateControl;
	}
	public String getDvdPlayer() {
		return dvdPlayer;
	}
	public void setDvdPlayer(String dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}
	public String getWIFI() {
		return WIFI;
	}
	public void setWIFI(String wIFI) {
		WIFI = wIFI;
	}
	public String getInRoomSafe() {
		return inRoomSafe;
	}
	public void setInRoomSafe(String inRoomSafe) {
		this.inRoomSafe = inRoomSafe;
	}
	public String getAirConditioning() {
		return airConditioning;
	}
	public void setAirConditioning(String airConditioning) {
		this.airConditioning = airConditioning;
	}
	public java.sql.Date getDateBookedStart() {
		return dateBookedStart;
	}
	public void setDateBookedStart(java.sql.Date dateBookedStart) {
		this.dateBookedStart = dateBookedStart;
	}
	public java.sql.Date getDateBookedEnd() {
		return dateBookedEnd;
	}
	public void setDateBookedEnd(java.sql.Date dateBookedEnd) {
		this.dateBookedEnd = dateBookedEnd;
	}
	public int getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public Boolean getIsRoomAvailable() {
		return isRoomAvailable;
	}
	public void setIsRoomAvailable(Boolean isRoomAvailable) {
		this.isRoomAvailable = isRoomAvailable;
	}	
}
