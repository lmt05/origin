package com.lmt.dubbo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("dubbo-client.xml");
        //得到IHello远程代理对象
        IHello iHello = (IHello) context.getBean("helloService");
        System.out.println( iHello.sayHello("李明涛") );
    }
}
