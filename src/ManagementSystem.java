import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    private String systemCredentials;
    private List<Guest> guests;
    private List<Reservation> reservations;
    private List<Room> rooms;

    public ManagementSystem() {
        this.systemCredentials = "admin_1728";
        guests = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public boolean login(String credentials) {
        if (credentials.equals(systemCredentials)) {
            return true;
        }
        return false;
    }

    public boolean addGuest(Guest newGuest) {
        if (guests.isEmpty()) {
            guests.add(newGuest);
            System.out.println("Guest "+ newGuest.getName() + " added successfully");
            return true;
        } else {
            for (Guest guest : guests) {
                if (guest.getName().equals(newGuest.getName())) {
                    System.out.println("Guest already registered");
                    return false;
                } else {
                    guests.add(newGuest);
                    System.out.println("Guest added successfully");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addReservation(Reservation newReservation) {
        if (reservations.isEmpty()) {
            reservations.add(newReservation);
            System.out.println("Reservation made successfully");
            return true;
        } else {
            for (Reservation reservation : reservations) {
                if (reservation.getRoom().getRoomNumber() == newReservation.getRoom().getRoomNumber()) {
                    System.out.println("Room already reserved");
                    return false;
                } else {
                    reservations.add(newReservation);
                    System.out.println("Reservation made successfully");
                    return true;
                }
            }
        }
        return false;
    }
}
