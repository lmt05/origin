package payport;

public enum PayType {
    ALI_PAY(new AliPay()),
    JD_PAY(new JDPay()),
    WECHAT_PAY(new WechatPay());

    private  Payment payment;
    PayType(Payment payment){this.payment = payment;}
    public Payment get(){
        return payment;
    };
}
