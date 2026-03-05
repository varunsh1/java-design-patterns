package behavioral.chainOfResponsibility;

abstract class Approver {
    protected Approver next; // stores the next object in the chain, Manager → Director → CEO
    public void setNext(Approver next){ // links handlers together.
        this.next = next;
    }
    abstract void approve(int amount);
}
