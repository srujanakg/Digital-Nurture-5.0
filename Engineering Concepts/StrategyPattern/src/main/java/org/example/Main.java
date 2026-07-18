package org.example;

public class Main {

    public static void main(String[] args) {

        PaymentContext card = new PaymentContext(new CreditCardPayment());
        card.executePayment(1000);

        PaymentContext paypal = new PaymentContext(new PayPalPayment());
        paypal.executePayment(2500);
    }
}