import java.util.Date;

public class Manager extends Employee {
    private int extensionNumber;
    private String systemCredentials;
    private ManagementSystem managementSystem;

    public Manager(String name, String cpf, double salary, int extensionNumber, ManagementSystem managementSystem) {
        super(name, cpf, salary);
        this.extensionNumber = extensionNumber;
        this.systemCredentials = "admin_1728";
        this.managementSystem = managementSystem;
    }

    @Override
    public void displayDetails() {
        System.out.println("** MANAGER **");
        System.out.println("Employee Name: " + getName());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salary: " + getSalary());
        System.out.println("Extension Number: " + extensionNumber);
        System.out.println("System Credentials: " + systemCredentials);
    }

    public CleaningService setCleaningService(int roomNumber, Date date, Cleaner cleaner) {
        return new CleaningService(roomNumber, date, cleaner);
    }

    public Guest registerGuest(String name, String address, int age, String cpf) {
        if (managementSystem.login(systemCredentials)) {
            Guest guest = new Guest(name, address, age, cpf);
            if (managementSystem.addGuest(guest)) return guest;
        } else {
            System.out.println("Login failed");
        }
        return null;
    }

    public Reservation addReservation(int id, Room room, Guest guest) {
        if (managementSystem.login(systemCredentials)) {
            Reservation reservation = new Reservation(id, room, guest);
            if (managementSystem.addReservation(reservation)) return reservation;
        } else {
            System.out.println("Login failed");
        }
        return null;
    }
}
