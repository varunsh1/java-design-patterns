package behavioral.strategy;

public class UPIPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid amount "+ amount + " through UPI");
    }
}
