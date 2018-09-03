import payport.PayType;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Order order = new Order("1002","ksdf829374921863",398.9);

        System.out.println(order.pay(PayType.JD_PAY));
        System.out.println(order.pay(PayType.WECHAT_PAY));
    }






}
