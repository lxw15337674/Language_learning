package server;

//Socker服务器端程序

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 40417 on 2017/2/4 0004.
 */
public class Server {

    public static void main(String[] args) throws IOException {
        //创建ServerSocket
        ServerSocket server = new ServerSocket(8008);
        System.out.println("启动服务器成功");
        //接受客户端的连接
        Socket socket = server.accept();
        //读取本地的文件
        FileInputStream in = new FileInputStream(new File("src/server/lol.txt"));
        //构建数据输出通道
        OutputStream out = socket.getOutputStream();
        //发送数据
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        System.out.println("发送成功");

        //关闭资源
        out.close();
        in.close();
        System.out.println("关闭服务器");
    }
}
