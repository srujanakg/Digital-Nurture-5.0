package org.example;

public class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway gateway = new PayPalGateway();

    @Override
    public void processPayment() {
        gateway.sendPayment();
    }
}