import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("****** HOTEL MANAGEMENT SYSTEM ******");
        ManagementSystem managementSystem = new ManagementSystem();

        Manager manager = new Manager("Jos√©", "123.456.789-10", 3000.0, 125, managementSystem);

        Receptionist receptionist1 = new Receptionist("Maria", "147.258.369-98", 1500.0, 124);
        Receptionist receptionist2 = new Receptionist("Jo√£o", "159.357.789-63", 1500.0, 123);

        Cleaner cleaner1 = new Cleaner("Anast·cio", "149.364.985-55", 1000.0);
        Cleaner cleaner2 = new Cleaner("EugÍnia", "166.687.694-11", 1000.0);
        Cleaner cleaner3 = new Cleaner("Tobias", "200.649.599-36", 1000.0);

        System.out.println("\n*** EMPLOYEES ***");

        manager.displayDetails();
        receptionist1.displayDetails();
        receptionist2.displayDetails();
        cleaner1.displayDetails();
        cleaner2.displayDetails();
        cleaner3.displayDetails();

        Room singleRoom = new Room(121, "Single Room", 120.0);
        Room doubleRoom = new Room(122, "Double Room", 240.0);
        Room tripleRoom = new Room(123, "Triple Room ", 450.0);
        Room suiteRoom = new Room(124, "Suite Room ", 450.0);

        System.out.println("\n*** NEW GUEST ***");
        Guest guest1 = manager.registerGuest("Ana", "Acre", 25, "154.136.478-96");
        Guest guest2 = manager.registerGuest("Pedro", "Jaguapari", 30, "154.136.478-97");

        System.out.println("\n*** NEW RESERVATIONS ***");
        Reservation reservation1 = manager.addReservation(1, singleRoom, guest1);
        Reservation reservation2 = manager.addReservation(2, suiteRoom, guest2);

        System.out.println("\n*** NEW PAYMENT ***");
        Double roomCharges = reservation1.getRoom().calculateRoomCharges(3);
        receptionist1.addPayment(1, roomCharges, reservation1);

        System.out.println("\n*** NEW CLEANING SERVICE ORDER ***");
        Date today = new Date();
        manager.setCleaningService(doubleRoom, today, cleaner2);        

        System.out.println("\n*** ADDING AMENITIES ***");
        receptionist1.addAmenities(reservation1, 200, "Shampoo");
        receptionist2.addAmenities(reservation2, 30, "Soap");


    }
}