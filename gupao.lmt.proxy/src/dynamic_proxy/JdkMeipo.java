package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;

public class JdkMeipo implements InvocationHandler{
     //引用被代理的对象。
    private Person person;

    public Object getInstance(Person person) throws Exception{
        this.person = person;
        Class<?> clazz =  person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是jdk媒婆，已经知道你的要求了");
        System.out.println("开始帮你挑选对象");
        method.invoke(this.person,args);
        System.out.println("合适的话就见家长把");
        return null;

    }
}
