public class Payment {
    private int paymentId;
    private double value;
    private Reservation reservation;

    public Payment(int paymentId, double value, Reservation reservation) {
        this.paymentId = paymentId;
        this.value = value;
        this.reservation = reservation;
    }

    public void processPayment(Reservation reservation) {
        reservation.setPaid(true);
    }
}
