package org.example.lab13.task2;

interface Payment {
    void processPayment();
}

class CreditCardPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing payment...");
    }
}

class PayPalPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

interface PaymentFactory {
    Payment createPayment();
}

class CreditCardPaymentFactory implements PaymentFactory {
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}

class PayPalPaymentFactory implements PaymentFactory {
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
class Main{
    public static void main(String[] args){

        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment = creditCardFactory.createPayment();
        creditCardPayment.processPayment();

        PaymentFactory paypalFactory = new PayPalPaymentFactory();
        Payment paypalPayment = paypalFactory.createPayment();
        paypalPayment.processPayment();
    }
}