public class Main {
    public static void main(String[] args) {
        System.out.println("****** HOTEL MANAGEMENT SYSTEM ******");
        ManagementSystem managementSystem = new ManagementSystem();

        Manager manager = new Manager("José", "123.456.789-10", 3000.0, 125, managementSystem);

        Receptionist receptionist1 = new Receptionist("Maria", "147.258.369-98", 1500.0, 124);
        Receptionist receptionist2 = new Receptionist("João", "159.357.789-63", 1500.0, 123);

        Cleaner cleaner1 = new Cleaner("", "149.364.985-55", 1000.0);
        Cleaner cleaner2 = new Cleaner("", "166.687.694-11", 1000.0);
        Cleaner cleaner3 = new Cleaner("", "200.649.599-36", 1000.0);

        System.out.println("*** EMPLOYEES ***");

        manager.displayDetails();
        manager.displayDetails();
        receptionist1.displayDetails();
        receptionist2.displayDetails();
        cleaner1.displayDetails();
        cleaner2.displayDetails();
        cleaner3.displayDetails();

        Room singleRoom = new Room(121, "Single Room", 120.0);
        Room doubleRoom = new Room(122, "Double Room", 240.0);
        Room tripleRoom = new Room(123, "Triple Room ", 450.0);
        Room suiteRoom = new Room(123, "Suite Room ", 450.0);

        System.out.println("*** NEW GUEST ***");
        Guest guest = manager.registerGuest("Ana", "", 25, "154.136.478-96");

        System.out.println("*** NEW RESERVATION ***");
        Reservation reservation = manager.addReservation(1, singleRoom, guest);

        System.out.println("*** NEW PAYMENT ***");
        Double roomCharges = singleRoom.calculateRoomCharges(3);
        receptionist1.addPayment(1, roomCharges, reservation);

        System.out.println("*** NEW CLEANING SERVICE ORDER ***");

        System.out.println("*** ADDInG AMENITIES ***");
        receptionist1.addAmenities(200, "Shampoo");
        receptionist1.addAmenities(200, "Soap");
        receptionist1.addAmenities(200, "Body lotion");


    }
}