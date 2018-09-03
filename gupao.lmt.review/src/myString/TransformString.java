package myString;

import java.util.Arrays;

public class TransformString {
    public static void main(String[] args) {
        /**
         * String -->char/char[]
         */
    String str="ab";
    char str1 = str.charAt(0);
    char str2 = str.charAt(1);
    char[] str3 = str.toCharArray();
        System.out.println(str1+".."+str2+"..."+ Arrays.toString(str3));
        /**
         * char/char[]--->String
         */
        System.out.println(String.valueOf(str1)+".."+String.valueOf(str3));

        /**
         *int--->String
         */
        int i = 1;
        String s= String.valueOf(i);
        String s1= Integer.toString(i);

        /**
         * String -->int
         */
        String string = "123456";
        int a=Integer.parseInt(string);
        int b = Integer.valueOf(string).intValue();
        System.out.println(a);
        System.out.println(b);
    }
}
