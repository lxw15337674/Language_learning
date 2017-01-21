package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/5 0005.
 */
public class Exception_handling {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        FileInputStream fileInputStream = null;
        try {
            File file = new File("D:\\a.txt");
            fileInputStream = new FileInputStream(file);
            //建立缓冲数组
            int length = 0; //保存每次读取到的字节个数.
            byte[] buf = new byte[4];//存储读取到的数据
            while (fileInputStream.read(buf) != -1) {
                System.out.print(new String(buf, 0, length));
            }
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("读取文件资源出错");
            //处理的代码...首先阻止代码运行,而且要通知调用者出现错误了.
            throw new RuntimeException(e);///把IOException传递给RuntimeException包装一层,然后再抛出.目的是为了让调用者知道哪里错误
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                    System.out.println("关闭资源成功");
                }
            } catch (IOException e) {
                System.out.println("关闭资源失败");
                throw new RuntimeException(e);
            }
        }
    }
}
