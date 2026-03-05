package behavioral.strategy;

public class PaypalPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid amount "+ amount +" through Paypal");
    }
}
