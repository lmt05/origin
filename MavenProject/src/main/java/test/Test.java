package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String a = "sfewoncaddsifewhsduwefadaadajfea";
        char[] c = a.toCharArray();
        Map<String,Integer> map = new HashMap<String, Integer>();
        Set key=map.keySet();
        for (int i = 0; i < c.length; i++) {
            if(key.contains(String.valueOf(c[i]))){
                int count =map.get(String.valueOf(c[i]));
                count++;
                map.put(String.valueOf(c[i]),count);
            }else{
                map.put(String.valueOf(c[i]),1);
            }
        }
        System.out.println(map.toString());


        Map<Character,Integer> map1= new HashMap<>();
        Set key1=map1.keySet();
        for (int i = 0; i < c.length; i++) {
            if(key1.contains(c[i])){
                int count =map1.get(c[i]);
                count++;
                map1.put(c[i],count);
            }else{
                map1.put(c[i],1);
            }
        }
        System.out.println(map1.toString());

        String str="32949617392";
    }
}
