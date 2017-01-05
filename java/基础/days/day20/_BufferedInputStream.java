package day20;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/5 0005.
 */
public class _BufferedInputStream {
    public static void main(String[] args) throws IOException {
        readTest2();
    }

    private static void readTest2() throws IOException {
        File file = new File("D:/a.txt");
        //建立数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲输入字节流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ///读取文件数据
        int content = 0;
        while ((content=bufferedInputStream.read())!=-1){
            System.out.print((char)content);
        }
        //调用buffer的close方法实际上关闭的是FileInputStream
        bufferedInputStream.close();
    }

}
