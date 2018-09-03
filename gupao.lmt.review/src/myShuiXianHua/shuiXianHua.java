package myShuiXianHua;

public class shuiXianHua {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if(get(i)){
                System.out.print(i+"..");
            }
        }
    }

    public static boolean get(int i){
        int a=i/100;
        int b=i%100/10;
        int c=i%10;
        int sum = a*a*a+b*b*b+c*c*c;
        if(sum==i){
            //System.out.println(i);
            return true;
        }
        return false;
    }
}
