package pckg_payment;

public class PayPalPayment implements PaymentStrategy {


    @Override
    public void performPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
