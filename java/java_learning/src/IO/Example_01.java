package IO;

import java.io.*;

/**
 * Created by 40417 on 2016/10/9 0009.
 */
public class Example_01 {
    public static void main(String[] args) {
        try {
            // 创建FileOutputStream对象
            FileOutputStream fs = new FileOutputStream("word3.txt");
            // 创建DataOutputStream对象
            DataOutputStream ds = new DataOutputStream(fs);
            ds.writeUTF("使用writeUFT()方法写入数据;"); // 写入磁盘文件数据
            ds.writeChars("使用writeChars()方法写入数据;");
            ds.writeBytes("使用writeBytes()方法写入数据.");
            ds.close(); // 将流关闭
            // 创建FileInputStream对象
            FileInputStream fis = new FileInputStream("word3.txt");
            // 创建DataInputStream对象
            DataInputStream dis = new DataInputStream(fis);
            System.out.print(dis.readUTF()); // 将文件数据输出
        } catch (Exception e) {
            e.printStackTrace(); // 输出异常信息
        }
    }
}
