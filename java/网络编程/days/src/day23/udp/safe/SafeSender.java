package day23.udp.safe;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by 40417 on 2017/1/22 0022.
 */
//
public class SafeSender {
    public static void main(String[] args) throws IOException {
        //建立udp的服务
        DatagramSocket socket = new DatagramSocket();
        //准备数据,数据封装到数据中发送
        DatagramPacket packet = null;
        String data = "呵呵...";
        for (int i = 0; i < 10; i++) { //连续发送10个数据包
            data = i + data;
            packet = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getLocalHost(), 9092);
            //发送数据包
            socket.send(packet);
        }
        //关闭资源
        socket.close();
    }
}
