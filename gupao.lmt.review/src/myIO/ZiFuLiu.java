package myIO;

import java.io.FileReader;
import java.io.FileWriter;

public class ZiFuLiu {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("e:\\zifuliu.txt");
        FileWriter writer = new FileWriter("e:/heheh.txt",true);
        int data = reader.read();
        while (data!=-1){
            writer.write(data);
            data = reader.read();
        }
        writer.close();
        reader.close();
        System.out.println("复制成功");
        System.out.println();

    }
}
