package day23.udp.Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by 40417 on 2017/1/22 0022.
 */
//群聊发送端
public class ChatSender extends Thread {
    @Override
    public void run() {
        System.out.println("启动发送端");
        try {
            //建立udp的服务
            DatagramSocket socket = new DatagramSocket();
            //准备数据,把数据封装到数据包中发送
            BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            DatagramPacket packet = null;
            while ((line = keyReader.readLine()) != null) {
                //把数据封装到数据包中,然后发送数据
                packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("192.168.187.1"), 9091);
                //把数据发送出去
                socket.send(packet);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
