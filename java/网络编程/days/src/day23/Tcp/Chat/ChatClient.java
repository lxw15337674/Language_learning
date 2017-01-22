package day23.Tcp.Chat;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by 40417 on 2017/1/22 0022.
 */
public class ChatClient {

    public static void main(String[] args) throws IOException {
        //建立tcp的客户端服务
        Socket socket = new Socket(InetAddress.getLocalHost(),9096);
        //获取socket的输出流对象。
        OutputStreamWriter socketOut =	new OutputStreamWriter(socket.getOutputStream());
        //获取socket的输入流对象
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //获取键盘的输入流对象，读取数据
        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        //不断的读取键盘录入的数据，然后把数据写出
        while((line = keyReader.readLine())!=null){
            socketOut.write(line+"\r\n");
            //刷新
            socketOut.flush();

            //读取服务端回送的数据
            line = socketReader.readLine();
            System.out.println("服务端回送的数据是："+line);
        }
        //关闭资源
        socket.close();
    }


}