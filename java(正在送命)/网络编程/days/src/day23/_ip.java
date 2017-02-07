package day23;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by 40417 on 2017/1/21 0021.
 */
public class _ip {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("ip地址:"+address.getHostAddress());
        System.out.println("主机名:"+address.getHostName());

        //获取别人的IP地址.
        InetAddress address1 = InetAddress.getByName("192.168.0.101");
        System.out.println("ip地址:"+address1.getHostAddress());
        System.out.println("主机名:"+address1.getHostName());

        //
        InetAddress[] arr = InetAddress.getAllByName("www.baidu.com");
        for (InetAddress a:arr){
            System.out.println(a);
        }

    }
}
