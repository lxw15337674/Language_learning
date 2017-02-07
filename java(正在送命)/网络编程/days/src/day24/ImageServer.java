package day24;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
//编写一个服务端可以给多个客户端发送图片(多线程)
public class ImageServer extends Thread {
    Socket socket;

    //使用该集合是用于存储ip地址的
    static HashSet<String> ips = new HashSet<>();

    public  ImageServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //接受用户的连接.
            OutputStream outputStream = socket.getOutputStream();
            FileInputStream fileInputStream = new FileInputStream("D:/1.jpg");
            //读取图片数据,把数据写出
            byte[] buf = new byte[1024];
            int length = 0;
            while ((length = fileInputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, length);
            }
            String ip = socket.getInetAddress().getHostAddress();//getInetAddress()获取对方的IP地址
            if(ips.add(ip)){
                System.out.println(ip+"成功下载,当前下载中人数是"+ips.size());
            }
            //关闭资源
            fileInputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        while (true) {
            Socket socket = serverSocket.accept();
            new ImageServer(socket).start();
        }
    }
}
