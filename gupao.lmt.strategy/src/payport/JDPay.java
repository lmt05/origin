package payport;

public class JDPay implements Payment {
    @Override
    public PayState pay(String uid, double amout) {
        System.out.println("欢迎使用京东支付");
        return new PayState(200,"支付完成",398.9);
    }
}
