package day20;
//拷贝图片

import java.io.*;

/**
 * Created by 40417 on 2017/1/5 0005.
 */
public class inout_copyImage {
    public static void main(String[] args) throws IOException {
        File inFile = new File("D:\\1.jpg");
        File destFile = new File("D\\2.jpg");
        //输入输出通道
        FileInputStream fileInputStream = new FileInputStream(inFile);
        FileOutputStream fileOutputStream = new FileOutputStream(destFile);
        //简历缓冲数据,边读边写
        byte[] buf = new byte[1024];
        int length = 0;
        while ((length=fileInputStream.read(buf))!=-1){
            fileOutputStream.write(buf,0,length);
        }
        //关闭资源
        fileInputStream.close();
        fileOutputStream.close();

    }

}

