package day20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/5 0005.
 */
public class _FileOutputStream {
    public static void main(String[] args) throws IOException {
        writeTest2();
    }
    //每次只能写入一个字节的数据
    private static void writeTest1() throws IOException {
        File file = new File("D:\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write('h');
        fileOutputStream.write('e');
        fileOutputStream.write('l');
        fileOutputStream.write('l');
        fileOutputStream.write('o');
        fileOutputStream.close();
    }

    private static void writeTest2() throws IOException {
        File file = new File("D:\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        String data = "hello world";
        fileOutputStream.write(data.getBytes());
        fileOutputStream.close();
    }


}
