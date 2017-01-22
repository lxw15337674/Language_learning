package day23.udp.Chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


//群聊接收端
public class ChatReceive extends Thread {
    @Override
    public void run() {
        System.out.println("启动接收端");
        try {
            DatagramSocket socket = new DatagramSocket(9091);
            //准备空的数据包存储数据
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            boolean flag = true;
            while (flag) {
                System.out.println("开始接收信息");
                socket.receive(packet);
                System.out.println(packet.getAddress().getHostAddress()+"说: "+new String(buf, 0, packet.getLength()));
            }
            //关闭资源
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
