public class Reservation {
    private int reservationId;
    private Room room;
    private Guest guest;
    private boolean paid;
    private Amenities amenities;

    public Reservation(int reservationId, Room room, Guest guest) {
        this.reservationId = reservationId;
        this.room = room;
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
