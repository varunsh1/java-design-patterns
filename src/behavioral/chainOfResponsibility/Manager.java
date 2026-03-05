package behavioral.chainOfResponsibility;

public class Manager extends Approver{
    void approve(int amount){
        if(amount<=1000){
            System.out.println("Manager approved = "+amount);
        }else if(next!=null){
            next.approve(amount);
        }
    }
}
