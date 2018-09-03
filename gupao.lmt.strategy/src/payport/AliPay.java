package payport;

public class AliPay implements Payment {
    @Override
    public PayState pay(String uid, double amout) {
        System.out.println("欢迎使用支付宝支付");
        return new PayState(200,"支付完成",amout);
    }
}
