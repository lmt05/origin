import dynamic_proxy.JdkMeipo;
import dynamic_proxy.Person;
import dynamic_proxy.ZhangSan;
import statics_proxy.Father;
import statics_proxy.Son;
import sun.misc.ProxyGenerator;

import javax.swing.*;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {

/*        Father father = new Father(new Son());
        father.findLove();*/

        try {
            Person person = (Person) new JdkMeipo().getInstance(new ZhangSan());
            person.findLove();
            System.out.println(person.getClass());
            System.out.println(person);

            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
