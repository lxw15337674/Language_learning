package day23.Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/**
 * Created by 40417 on 2017/1/22 0022.
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9090);
        //获取到Socket的输出流服务
        OutputStream outputStream = socket.getOutputStream();
        //利用输出流对象把数据写出即可
        outputStream.write("服务端你好".getBytes());

        //获取到输入流对象,读取服务端回送的数据
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println("客户端接收的数据:" + new String(buf,0,length));

        //关闭资源
        socket.close();

    }
}
