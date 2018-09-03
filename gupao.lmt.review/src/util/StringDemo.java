package util;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class StringDemo {
    public static void main(String[] args) {
        String str = "I like you";
        char[] s=str.toCharArray();
        System.out.println(s.length);

        for (int i = 0; i <s.length ; i++) {
            char a= ' ';
            int count = s.length - 1 -i;
            if(i<count){
               a = s[count];
               s[count] = s[i];
               s[i]=a;
            }
        }

        System.out.println(String.valueOf(s));
        System.out.println(s.length);

    }
}
