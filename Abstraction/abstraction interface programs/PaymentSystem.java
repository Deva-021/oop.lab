interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardProcessor implements PaymentStrategy {
    String cardNumber;
    String expiryDate;
    String cvv;

    public CreditCardProcessor(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}

class PayPalProcessor implements PaymentStrategy {
    String email;

    public PayPalProcessor(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}

class BitcoinProcessor implements PaymentStrategy {
    String bitcoinAddress;

    public BitcoinProcessor(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin: " + bitcoinAddress);
    }
}

class PurchaseManager {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PurchaseManager manager = new PurchaseManager();

        PaymentStrategy creditCardPayment = new CreditCardProcessor("1234567890123456", "12/24", "123");
        manager.setPaymentStrategy(creditCardPayment);
        manager.processPayment(100.0);

        PaymentStrategy payPalPayment = new PayPalProcessor("user@example.com");
        manager.setPaymentStrategy(payPalPayment);
        manager.processPayment(50.0);

        PaymentStrategy bitcoinPayment = new BitcoinProcessor("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2");
        manager.setPaymentStrategy(bitcoinPayment);
        manager.processPayment(200.0);
    }
}