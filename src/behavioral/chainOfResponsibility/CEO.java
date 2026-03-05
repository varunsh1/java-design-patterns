package behavioral.chainOfResponsibility;

public class CEO extends Approver{
    void approve(int amount){
        System.out.println("CEO approved = "+amount);
    }
}
