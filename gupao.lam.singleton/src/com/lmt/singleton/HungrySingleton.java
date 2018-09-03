package com.lmt.singleton;

public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
    }

    public static HungrySingleton getHungrySingleton(){
     return hungrySingleton;
    }

}
