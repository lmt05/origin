package payport;

public class WechatPay implements Payment {
    @Override
    public PayState pay(String uid, double amout) {
        System.out.println("欢迎使用微信支付");
        return new PayState(200,"支付完成",398.9);
    }
}
