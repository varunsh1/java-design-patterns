package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy upiPayment = new UPIPayment();
        PaymentContext context = new PaymentContext(upiPayment);
        context.executePayment(1000);

        PaymentStrategy paypalPayment = new PaypalPayment();
        PaymentContext context1 = new PaymentContext(paypalPayment);
        context1.executePayment(234324000);
    }
}


/*
                        PaymentStrategy                    (interface)
                              |
          -----------------------------------------
          |                   |                   |
   CreditCardPayment     UPIPayment         PaypalPayment  (concrete class)
          |                   |
          ------------------------------------------
                              |
                         PaymentContext                    (user interaction)


The context uses a strategy but doesn't know the implementation details.

 */