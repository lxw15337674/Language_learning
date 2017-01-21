package day21;

import java.io.*;
import java.util.Arrays;

/**
 * Created by 40417 on 2017/1/5 0005.
 */
public class OutChinese {
    public static void main(String[] args) throws IOException {
        writeTest();
    }

    //使用字节流写中文. 中文借助字符串的getBytes方法对字符串进行了编码.
    public static void writeTest() throws IOException {
        File file = new File("D:/a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String data = "大家好";
        byte[] buf = data.getBytes();
        System.out.println("输出的内容"+ Arrays.toString(buf));
        fileOutputStream.write(buf);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        int content = 0;
        while((content=fileInputStream.read())!=-1){
            System.out.println((char)content);
        }
        fileInputStream.close();

    }
}

