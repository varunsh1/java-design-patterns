package behavioral.strategy;

import jdk.dynalink.NamedOperation;

public class CreditCardPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid amount "+ amount +" through credit card");
    }
}
