package com.lmt.singleton;

public class LanSingleton {
    private static LanSingleton lanSingleton;

    private LanSingleton() {
    }

    public static LanSingleton getLanSingleton(){
        if(lanSingleton == null){
            lanSingleton = new LanSingleton();
        }
        return lanSingleton;
    }
}
