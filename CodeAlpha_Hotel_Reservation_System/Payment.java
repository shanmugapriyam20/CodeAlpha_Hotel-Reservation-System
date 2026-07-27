public class Payment {
    private double amount;
    private boolean paymentStatus;

    public Payment(double amount) {
        this.amount = amount;
        this.paymentStatus = false;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void processPayment() {
        paymentStatus = true;
        System.out.println("Payment Successful!");
    }

    @Override
    public String toString() {
        return "Amount: ₹" + amount +
               "\nPayment Status: " +
               (paymentStatus ? "Paid" : "Pending");
    }
}