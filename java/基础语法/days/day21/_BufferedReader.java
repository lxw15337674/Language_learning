package day21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/17 0017.
 */
public class _BufferedReader {
    public static void main(String[] args) throws IOException {
        readTest1();
    }
    public static void readTest1() throws IOException {
        File file = new File("D:/a.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //读取数据
//        int content = bufferedReader.read();
//        System.out.println((char) content);
        //使用bufferedReader扩展的功能,readLine()一次读取一行文本
        String content  = bufferedReader.readLine();
        System.out.println(content);
        bufferedReader.close();
    }
}
