public class Receptionist extends Employee {
    private int extensionNumber;

    public Receptionist(String name, String cpf, double salary, int extensionNumber) {
        super(name, cpf, salary);
        this.extensionNumber = extensionNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("** RECEPTIONIST **");
        System.out.println("Employee Name: " + getName());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salary: " + getSalary());
        System.out.println("Extension Number: " + extensionNumber);
    }

    public Amenities addAmenities(int quantity, String description) {
        return new Amenities(quantity, description);
    }

    public Payment addPayment(int paymentId, double value, Reservation reservation) {
        Payment payment = new Payment(paymentId, value, reservation);
        payment.processPayment(reservation);
        return payment;
    }


}
