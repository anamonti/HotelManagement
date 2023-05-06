import javax.swing.*;
import java.util.Date;
import java.util.Random;
import java.util.random.RandomGenerator;

public class CleaningService {
    private int serviceId;
    private int roomNumber;
    private Date serviceSchedule;
    private Cleaner cleaner;

    public CleaningService(Room room, Date serviceSchedule, Cleaner cleaner) {
        this.serviceId = generateRandomId();
        this.roomNumber = room.getRoomNumber();
        this.serviceSchedule = serviceSchedule;
        this.cleaner = cleaner;
    }

    private int generateRandomId() {
        Random random = new Random();
        return random.nextInt(100);
    }
    
    public Date getDate() {
    	return serviceSchedule;
    }
    
    public int getRoom() {
    	return roomNumber;
    }
}
