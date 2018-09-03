package com.lmt.singleton;

public class LanSingletonThree {
    private boolean flag = false;
    private static LanSingletonThree lanSingletonThree = null;
    private LanSingletonThree(){
        synchronized (LanSingletonThree.class){
            if(flag == false){
                flag =! flag;
            }else {
                throw new RuntimeException("单利已被侵犯");
            }
        }

    }

//默认不加载
    private static class LanHolder{
        private static final LanSingletonThree lst = new LanSingletonThree();
    }

    public static final LanSingletonThree getLanSingletonThree(){
        return LanHolder.lst;
    }
}
