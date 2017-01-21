
package day23;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by 40417 on 2017/1/21 0021.
 */
//接收端
public class udpReceive {
    public static void main(String[] args) throws IOException {
        //建立udp服务,并且监听一个端口
        DatagramSocket Socket = new DatagramSocket(9090);
        //准备空的数据包用于存放数据
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
        //调用udp的服务接收数据
        Socket.receive(datagramPacket);//receive是一个阻塞型的方法,没有接收到数据时,会一直等待.

        System.out.println(new String(buf,0,datagramPacket.getLength()));
        //关闭资源
        Socket.close();
    }

}
