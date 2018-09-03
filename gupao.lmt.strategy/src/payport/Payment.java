package payport;

public interface Payment {
    public PayState pay(String uid,double amout);
}
