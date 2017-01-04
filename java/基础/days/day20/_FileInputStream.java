package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/4 0004.
 */
public class _FileInputStream {
    public static void main(String[] args) throws IOException {
        readtest4();
    }

    //读取方式一:无法读取完整一个文件的数据..
    public static void readtest1() throws IOException {
        File file = new File("D:\\a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int content = fileInputStream.read();
        System.out.println("读到的内容是: " + (char) content);
        fileInputStream.close();
    }

    //读取方式二:使用循环读取文件的数据.
    public static void readtest2() throws IOException {
        File file = new File("D:\\a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int content = 0;//声明该变量用于存储读取到的数据.
        while ((content = fileInputStream.read()) != -1) {
            System.out.print((char) content);
        }
        fileInputStream.close();
    }

    //读取方式三:使用缓冲数组读取.缺点:无法读取完整一个文件的数据.
    public static void readtest3() throws IOException {
        File file = new File("D:\\a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲数组
        byte[] buf = new byte[1024];
        int length = fileInputStream.read(buf);
        System.out.println(length);//读取字符的长度
        //使用字节数组构建字符串
        String content = new String(buf);
        System.out.print("内容:" + content);
        fileInputStream.close();
    }

    //读取方式四:使用循环数组配合循环一起读取
    public static void readtest4() throws IOException {
        File file = new File("D:\\a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲数组
        int length = 0; //保存每次读取到的字节个数.
        byte[] buf = new byte[4];//存储读取到的数据
        while (fileInputStream.read(buf)!=-1) {
            System.out.print(new String(buf));
        }

        fileInputStream.close();
    }

}
