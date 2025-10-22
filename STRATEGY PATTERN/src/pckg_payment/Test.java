package pckg_payment;

public class Test {

    public static void main(String[] args) {
        PaymentModule paymentModule = new PaymentModule(new CreditCardPayment());
        paymentModule.performPayment(10);
        paymentModule.setPaymentStrategy(new PayPalPayment());
        paymentModule.performPayment(20);
    }
}
