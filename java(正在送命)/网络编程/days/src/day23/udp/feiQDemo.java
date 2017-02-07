package day23.udp;

import java.io.IOException;
import java.net.*;

/**
 * Created by 40417 on 2017/1/22 0022.
 */
//利用udp协议给飞Q发送消息

public class feiQDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String data = getData("飞Q你好");
        DatagramPacket packet = new DatagramPacket(data.getBytes(),data.getBytes().length, InetAddress.getByName("192.169.2.151"),2425);
        socket.send(packet);
        socket.close();
    }
    //飞Q数据格式:
//       版本号:时间:发送者:IP:发送的标识符:真正的内容
    //把数据拼接成指定格式的数据
    public static String getData(String content){
        StringBuilder sb = new StringBuilder();
        sb.append("1.0:");
        sb.append(System.currentTimeMillis()+":");
        sb.append("李希望:");
        sb.append("192.168.10.1:");
        sb.append("32:");
        sb.append(content);
        return sb.toString();
    }
}
