package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Director director = new Director();
        CEO ceo = new CEO();
        // create chain
        manager.setNext(director);
        director.setNext(ceo);
        manager.approve(1002);
    }
}


/*
Chain of Responsibility passes a request through multiple handlers until one handler processes it.

1️⃣ Check if it can handle request
2️⃣ If yes → process
3️⃣ If not → pass to next handler

Manager → cannot approve → pass to Director
Director → cannot approve → pass to CEO
CEO → approves

 */