package util;

import java.util.ArrayList;

public class DisposeString {

    public String getDisposeString(String str, Object o) {

        char chs[] = str.toCharArray();
        System.out.println(chs.toString());
        int count = 0;

        for (char ch = 'a'; ch < 'z'; ch++) {
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == chs[i])
                    count++;
            }
            if (count != 0) {
                System.out.println("字符串中" + ch + "有" + count + "个");
            }
        }

        System.out.println("字符串：" + str + "中大写字母有：");

        for (char ch = 'A'; ch < 'Z'; ch++) {
            count = 0;
            for (int i = 0; i < chs.length; i++) {
                if (ch == chs[i])
                    count++;
            }
            if (count != 0) {
                System.out.println("字符串" + ch + "有" + count + "个");
            }
        }
        System.out.println("字符串" + str + "中数字有：");
        for (char ch = '0'; ch < '9'; ch++) {
            count = 0;
            for (int i = 0; i < chs.length; i++) {
                if (ch == chs[i])
                    count++;
            }
            if (count != 0)
                System.out.println("字符中" + ch + "有" + count + "个");
        }
        return null;
    }
}
