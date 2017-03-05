package day20;

import java.io.*;

/**
 * Created by 40417 on 2017/1/5 0005.
 */
public class buffer_copy {
    public static void main(String[] args) throws IOException {
        File inFile = new File("D:\\1.jpg");
        File destFile = new File("D\\2.jpg");
        //输入输出通道
        FileInputStream fileInputStream = new FileInputStream(inFile);
        FileOutputStream fileOutputStream = new FileOutputStream(destFile);
        //建立缓冲输入输出流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //边读边写
        int content = 0;
        while ((content=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(content);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();

    }
}
