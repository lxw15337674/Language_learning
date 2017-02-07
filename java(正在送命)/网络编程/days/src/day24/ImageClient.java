package day24;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ImageClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9000);
        //获取到Socket的输出流对象
        InputStream inputStream = socket.getInputStream();
        //获取文件的输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\copy1.jpg");
        //边读边写
        byte[] buf = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buf))!=-1){
            fileOutputStream.write(buf,0,length);
        }
        //关闭资源
        socket.close();

    }
}
