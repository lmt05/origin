package lmt.com;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(90);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        String str = "";
        while ((str = br.readLine())!=null){
            System.out.println(str);
        }
        socket.shutdownInput();

        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.write("欢迎您");
        pw.flush();

        pw.close();
        os.close();
        br.close();
        isr.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
