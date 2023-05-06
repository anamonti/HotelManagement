public class Room {
    private int roomNumber;
    private String roomType;
    private double roomPrice;
    private Amenities amenities;

    public Room(int roomNumber, String roomType, double roomPrice) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double calculateRoomCharges(int numberOfDays) {
        return numberOfDays * roomPrice;
    }
    
    public void addAmenities(Amenities amenities) {
    	this.amenities = amenities;
    }
}
