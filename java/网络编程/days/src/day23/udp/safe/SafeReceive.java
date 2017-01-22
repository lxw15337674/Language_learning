package day23.udp.safe;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by 40417 on 2017/1/22 0022.
 */
public class SafeReceive {
    public static void main(String[] args) throws IOException, InterruptedException {
        //建立udp的服务
        DatagramSocket socket = new DatagramSocket(9092);
        //建立空的数据包存储数据
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //不断接收数据包
        while (true) {
            socket.receive(packet);
            System.out.println(new String(buf, 0, packet.getLength()));
            //限制接收能力
            Thread.sleep(10);
        }

    }
}
