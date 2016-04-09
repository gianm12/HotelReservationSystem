package Objects;

public class RoomInformation {
	private int sizeOfRoom;
	private int numberOfBeds;
	private double priceOfRoom=0.00;
	private boolean isSmoking;
	private boolean isPatioView;
	private boolean isMiniFridge;
	private Date dateBooked; //instead of having the Data object here, in the setter or getter call the Date object to put it in the right format
	private boolean isbooked;
	private Date availableDate;
	private String bedType;
	private String typeOfRoom;
	private String typeOfBath;
	private String extraFeatures;
	
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
	public boolean isSmoking() {
		return isSmoking;
	}
	public void setSmoking(boolean isSmoking) {
		this.isSmoking = isSmoking;
	}
	public boolean isPatioView() {
		return isPatioView;
	}
	public void setPatioView(boolean isPatioView) {
		this.isPatioView = isPatioView;
	}
	public boolean isMiniFridge() {
		return isMiniFridge;
	}
	public void setMiniFridge(boolean isMiniFridge) {
		this.isMiniFridge = isMiniFridge;
	}
	public String getDatebooked() {
		return dateBooked.getWholeDate();
	}
	public void setDatebooked(Date datebooked) {
		this.dateBooked = datebooked;
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
	
	
	
	
}
