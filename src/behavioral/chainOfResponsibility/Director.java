package behavioral.chainOfResponsibility;

public class Director extends Approver{
    void approve(int amount){
        if(amount<=5000){
            System.out.println("Director approved = "+amount);
        }else if(next!=null){
            next.approve(amount);
        }
    }
}
