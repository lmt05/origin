import payport.PayState;
import payport.PayType;

public class Order {
    private String uid;
    private String orderId;
    private double amount;

   public Order(String uId,String orderId,double amount){
       this.uid = uid;
       this.orderId = orderId;
       this.amount = amount;
   }


   public PayState pay(PayType payType){
       return payType.get().pay(uid,amount);
   }
}
