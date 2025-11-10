abstract class PaymentProcessor {
    // Abstract method
    public abstract boolean processPayment(double amount);

    // Non-abstract method
    public void displayProcessorType() {
        System.out.println("This is a generic payment processor.");
    }
}
class CreditCardPaymentProcessor extends PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Processing $%.2f via Credit Card.%n", amount);
        return true;
    }

    @Override
    public void displayProcessorType() {
        System.out.println("This is a Credit Card payment processor.");
    }
}
class PayPalPaymentProcessor extends PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Processing $%.2f via PayPal.%n", amount);
        return true;
    }

    @Override
    public void displayProcessorType() {
        System.out.println("This is a PayPal payment processor.");
    }
}
public class abstraction {
    public static void main(String[] args) {
        // Using CreditCardPaymentProcessor
        PaymentProcessor creditCard = new CreditCardPaymentProcessor();
        creditCard.displayProcessorType();
        creditCard.processPayment(100.50);

        System.out.println();

        // Using PayPalPaymentProcessor
        PaymentProcessor paypal = new PayPalPaymentProcessor();
        paypal.displayProcessorType();
        paypal.processPayment(25.00);
    }
}
