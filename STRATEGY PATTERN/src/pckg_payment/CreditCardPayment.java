package pckg_payment;

public class CreditCardPayment implements PaymentStrategy {
    
    @Override
    public void performPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
