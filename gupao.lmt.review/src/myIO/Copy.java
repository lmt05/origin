package myIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
    public static void main(String[] args) throws Exception{
        File file = new File("e:\\111.txt");
        if(file.exists()==false){
            file.createNewFile();
        }
        String str = "李明涛复习的第一个io小程序";
        byte[] b= str.getBytes();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(b);
        fos.close();
        copy(file);

    }

    public static void copy(File file) throws Exception{
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("e:\\322.txt",true);
        byte[] b = new byte[1024];
        int data = fis.read(b);
        while (data!=-1){
            fos.write(b);
            data = fis.read(b);
        }
        fos.close();
        fis.close();
        file.delete();
        System.out.println("复制成功");

    }
}
