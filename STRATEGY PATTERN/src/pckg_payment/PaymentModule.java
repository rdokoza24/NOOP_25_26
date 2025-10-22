package pckg_payment;

public class PaymentModule {

    private PaymentStrategy paymentStrategy;

    public PaymentModule(PaymentStrategy ps) {
        System.out.println("PaymentModule initialized with strategy: " + ps.getClass().getSimpleName());
        this.paymentStrategy = ps;
    }

    public void performPayment(double amount) {
        paymentStrategy.performPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy ps) {
        this.paymentStrategy = ps;
    }
}
