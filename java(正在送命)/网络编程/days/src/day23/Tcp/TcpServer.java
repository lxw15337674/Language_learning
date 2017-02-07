package day23.Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 40417 on 2017/1/22 0022.
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        //建立tcp服务端,并且监听一个端口
        ServerSocket serverSocket = new ServerSocket(9090);
        //接受客户端的连接
        Socket socket = serverSocket.accept();//accept() 接受客户端的连接 也是一个阻塞性的方法.
        //获取输入流对象,读取客户端发送的内容
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println("服务端接收:" + new String(buf,0,length));
        //获取Socket输出流对象,向客户端发送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端你也好!".getBytes());
        //关闭资源
        serverSocket.close();
    }
}
