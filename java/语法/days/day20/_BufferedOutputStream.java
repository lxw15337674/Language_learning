package day20;

import java.io.*;

/**
 * Created by 40417 on 2017/1/5 0005.
 */
public class _BufferedOutputStream {
    public static void main(String[] args) {

    }
    private static void writeTest2() throws IOException {
        File file = new File("D:\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String data = "hello world";
        //把数据写出
        bufferedOutputStream.write(data.getBytes());
        //把缓冲数组中内部的数据写到硬盘上面
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
