package com.lmt.singleton;

public class LanSingletonTwo {

    private static LanSingletonTwo lanSingletonTwo = null;
    private LanSingletonTwo(){}

    public static synchronized LanSingletonTwo getLanSingletonTwo(){
        if(lanSingletonTwo == null){
            lanSingletonTwo = new LanSingletonTwo();
        }
        return  lanSingletonTwo;
    }
}
