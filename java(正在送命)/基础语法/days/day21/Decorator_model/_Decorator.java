package day21.Decorator_model;

import java.io.*;

/**
 * Created by 40417 on 2017/1/17 0017.
 */
public class _Decorator {
    public static void main(String[] args) throws IOException {
        File inFile = new File("C:\\Users\\40417\\Desktop\\Language _learning\\java\\基础\\days\\day21\\_writer.java");
        //建立数据通道
        FileReader fileReader = new FileReader(inFile);
        //建立缓冲输入字符流
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        BufferedSemi2 bufferedSemi = new BufferedSemi2(bufferedReader);
//        //建立带行号的缓冲输入字符流
        BufferedLineNum1 bufferedLineNum = new BufferedLineNum1(bufferedSemi);
        //建立带分号的缓冲输入字符流
//        BufferedSemi2 bufferedSemi = new BufferedSemi2(bufferedReader);

        String line =null;
        while ((line = bufferedLineNum.readLine())!=null){
            System.out.println(line);
        }
    }
}
//带分号的缓冲输入字符流
class BufferedSemi2 extends BufferedReader{
    //在内部维护一个被装饰类的引用
    BufferedReader bufferedReader;

    public BufferedSemi2(BufferedReader bufferedReader) {
        super(bufferedReader);//没有作用,只为不报错.
        this.bufferedReader = bufferedReader;
    }

    public String readLine() throws IOException {
        String line = bufferedReader.readLine();
        if (line == null) {
            return null;
        }
        line = line+";";
        return line;
    }
}

//带行号的缓冲输入字符流
class BufferedLineNum1 extends BufferedReader{
    //在内部维护一个被装饰类的引用
    BufferedReader bufferedReader;
    int count = 1;

    public BufferedLineNum1(BufferedReader bufferedReader) {
        super(bufferedReader);
        this.bufferedReader = bufferedReader;
    }

    public String readLine() throws IOException {
        String line = bufferedReader.readLine(); //如果这里的ReadLine方法是调用了bufferedSemi的readLine方法,就可以添加分号
        if (line == null) {
            return null;
        }
        line = count + " " + line;
        count++;
        return line;
    }
}
