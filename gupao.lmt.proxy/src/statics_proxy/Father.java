package statics_proxy;

public class Father {
    private Son son;

    public Father(Son son){
        this.son = son;
    }

    public void findLove(){
        son.findLove();
    }

}
