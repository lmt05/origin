package myString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 *对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。
 */
public class hashSetString {
    public static void main(String[] args) {
        String s= "lsjd8wsdwehushuweksdksfef";
        //System.out.println(hashSetGet(s));
        System.out.println(hashMapGet(s));

    }
    public static String hashSetGet(String str){
        char [] chars = str.toCharArray();
        HashSet hs = new HashSet();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            boolean b = hs.add(chars[i]);
            if(b==false) {
                return String.valueOf(chars[i]);
            }
        }
        return "0";
    }
/*
存到hashMap中，配合ArrayList 扩展问题大部分都能解决
 */

    public static String hashMapGet(String str){
        int sum = 1;
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        char[] chars = str.toCharArray();
        System.out.println(String.valueOf(chars));
        for (int i = 0; i < chars.length; i++) {
            String s = String.valueOf(chars[i]);
            boolean b = hm.containsKey(s);
            if(b==true){
                sum=hm.get(s)+1;
                hm.put(s,sum);
            }else {
                sum = 1;
                hm.put(s,sum);
            }
        }
        System.out.println(hm);
        ArrayList<String> keyList = new ArrayList<String>();
        for (Map.Entry<String,Integer> e:hm.entrySet()) {
            if(e.getValue().equals(2)){
                keyList.add(e.getKey());
            }
        }
        System.out.println(hm.entrySet());
        if(keyList!=null) {
            for (String i : keyList) {
                return i;
            }
        }
        return "0";
    }
}
