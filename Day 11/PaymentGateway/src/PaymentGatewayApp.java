import java.util.*;

enum PaymentMethodType {
    CREDIT_CARD,
    PAYPAL
}

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING
}


 class PaymentRequest {
    private final double amount;
    private final String currency;
    private final PaymentMethodType paymentMethodType;
    private final Map<String, String> paymentMethodDetails;

    public PaymentRequest(double amount, String currency, PaymentMethodType type, Map<String, String> details) {
        this.amount = amount;
        this.currency = currency;
        this.paymentMethodType = type;
        // Defensive copy to prevent external mutation
        this.paymentMethodDetails = details == null ? Collections.emptyMap() : new HashMap<>(details);
    }

    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }
    public PaymentMethodType getPaymentMethodType() { return paymentMethodType; }

    // Return unmodifiable view to prevent external mutation
    public Map<String, String> getPaymentMethodDetails() {
        return Collections.unmodifiableMap(paymentMethodDetails);
    }
}


// PaymentResponse class
class PaymentResponse {
    private String transactionId;
    private PaymentStatus status;
    private String message;

    public PaymentResponse(String transactionId, PaymentStatus status, String message) {
        this.transactionId = transactionId;
        this.status = status;
        this.message = message;
    }

    public String getTransactionId() { return transactionId; }
    public PaymentStatus getStatus() { return status; }
    public String getMessage() { return message; }
}

// PaymentProcessor interface
interface PaymentProcessor {
    PaymentResponse processPayment(PaymentRequest request);
}

// CreditCardProcessor class
class CreditCardProcessor implements PaymentProcessor {
    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        double amount = request.getAmount();
        String cardNumber = request.getPaymentMethodDetails().get("cardNumber");

        if (amount < 100 && !cardNumber.equals("0000-0000-0000-0000")) {
            return new PaymentResponse(UUID.randomUUID().toString(), PaymentStatus.SUCCESS, "Payment approved");
        } else {
            return new PaymentResponse(UUID.randomUUID().toString(), PaymentStatus.FAILED, "Payment declined");
        }
    }
}

// PayPalProcessor class
class PayPalProcessor implements PaymentProcessor {
    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        double amount = request.getAmount();
        String email = request.getPaymentMethodDetails().get("email");

        if (amount < 100 && !email.equalsIgnoreCase("blocked@paypal.com")) {
            return new PaymentResponse(UUID.randomUUID().toString(), PaymentStatus.SUCCESS, "Payment approved");
        } else {
            return new PaymentResponse(UUID.randomUUID().toString(), PaymentStatus.FAILED, "Payment failed");
        }
    }
}

// PaymentGateways class
class PaymentGateways {
    private Map<PaymentMethodType, PaymentProcessor> processors = new HashMap<>();

    public PaymentGateways() {
        processors.put(PaymentMethodType.CREDIT_CARD, new CreditCardProcessor());
        processors.put(PaymentMethodType.PAYPAL, new PayPalProcessor());
    }

    public PaymentResponse process(PaymentRequest request) {
        PaymentProcessor processor = processors.get(request.getPaymentMethodType());
        if (processor != null) {
            return processor.processPayment(request);
        } else {
            return new PaymentResponse(null, PaymentStatus.FAILED, "Unsupported payment method");
        }
    }
}

// Main class
public class PaymentGatewayApp {
    public static void main(String[] args) {
        PaymentGateways gateway = new PaymentGateways();

        // Credit Card Payment
        Map<String, String> ccDetails = new HashMap<>();
        ccDetails.put("cardNumber", "1234-5678-9012-3456");
        ccDetails.put("expiry", "12/26");

        PaymentRequest ccRequest = new PaymentRequest(
            75.0,
            "USD",
            PaymentMethodType.CREDIT_CARD,
            ccDetails
        );

        PaymentResponse ccResponse = gateway.process(ccRequest);
        System.out.println("Credit Card Payment:");
        System.out.println("Transaction ID: " + ccResponse.getTransactionId());
        System.out.println("Status: " + ccResponse.getStatus());
        System.out.println("Message: " + ccResponse.getMessage());

        // PayPal Payment
        Map<String, String> paypalDetails = new HashMap<>();
        paypalDetails.put("email", "user@example.com");
        paypalDetails.put("password", "secure123");

        PaymentRequest paypalRequest = new PaymentRequest(
            150.0,
            "EUR",
            PaymentMethodType.PAYPAL,
            paypalDetails
        );

        PaymentResponse paypalResponse = gateway.process(paypalRequest);
        System.out.println("\nPayPal Payment:");
        System.out.println("Transaction ID: " + paypalResponse.getTransactionId());
        System.out.println("Status: " + paypalResponse.getStatus());
        System.out.println("Message: " + paypalResponse.getMessage());
    }
}
