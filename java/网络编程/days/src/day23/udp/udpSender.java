
package day23.udp;

import java.io.IOException;
import java.net.*;

/**
 * Created by 40417 on 2017/1/21 0021.
 */
//发送端
public class udpSender {
    public static void main(String[] args) throws IOException {
        //建立udp服务
        DatagramSocket datagramSocket = new DatagramSocket();
        //准备数据,把数据封装到数据包中
        String data = "这是一个udp的例子.";
        //创建一个数据包
        DatagramPacket packet = new DatagramPacket(data.getBytes(),data.getBytes().length, InetAddress.getLocalHost(),9090);
        //调用udp的服务发送数据包
        datagramSocket.send(packet);
        //关闭资源-->释放占用的端口号
        datagramSocket.close();

    }
}
