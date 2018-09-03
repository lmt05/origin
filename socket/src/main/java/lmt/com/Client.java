package lmt.com;

import java.io.*;
import java.net.Socket;
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket =new Socket("localhost",90);
        OutputStream os =socket.getOutputStream();
        PrintWriter pw =new PrintWriter(os);
        pw.write("李明涛");
        pw.flush();
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str = "";
        while ((str=br.readLine())!=null){
            System.out.println("服务端说："+str);
        }

        br.close();
        is.close();
        pw.close();
        os.close();
        socket.close();
    }
}
