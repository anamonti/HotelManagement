public class Receptionist extends Employee {
    private int extensionNumber;

    public Receptionist(String name, String cpf, double salary, int extensionNumber) {
        super(name, cpf, salary);
        this.extensionNumber = extensionNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n** RECEPTIONIST **");
        System.out.println("Employee Name: " + getName());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salary: " + getSalary());
        System.out.println("Extension Number: " + extensionNumber);
    }

    public void addAmenities(Reservation reservation, int quantity, String description) {
    	Amenities amenities = new Amenities(quantity, description);
    	Room room = reservation.getRoom();
    	room.addAmenities(amenities);
    	System.out.println("Amenities added to room " + room.getRoomNumber() + " successfully");
        return;
    }

    public Payment addPayment(int paymentId, double value, Reservation reservation) {
        Payment payment = new Payment(paymentId, value, reservation);
        payment.processPayment(reservation);
        System.out.println(String.format("The reservation of room %s received a payment of %s", reservation.getRoom().getRoomNumber(), value));
        return payment;
    }


}
