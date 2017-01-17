//需求1:编写一个类扩展BufferedReader的功能,增强readLIne方法返回的字符串带有行号
//需求2:编写一个类扩展BufferedReader的功能,增强readLIne方法返回的字符串带有分号
//需求3:编写一个类扩展BufferedReader的功能,增强readLIne方法返回的字符串带有双引号
package day21.Decorator_model;

import java.io.*;

/**
 * Created by 40417 on 2017/1/17 0017.
 */
public class normal {
    public static void main(String[] args) throws IOException {
        File inFile = new File("C:\\Users\\40417\\Desktop\\Language _learning\\java\\基础\\days\\day21\\_writer.java");
        //建立数据通道
        FileReader fileReader = new FileReader(inFile);
        //建立缓冲输入字符流
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //建立带行号的缓冲输入字符流
//        BufferedLineNum bufferedLineNum = new BufferedLineNum(bufferedReader);
        //建立带分号的缓冲输入字符流
        BufferedSemi bufferedSemi = new BufferedSemi(bufferedReader);
        String line = null;
        while ((line = bufferedSemi.readLine()) != null) {
            System.out.println(line);
        }

    }
}

//带行号
class BufferedLineNum extends BufferedReader {
    int count = 1;

    public BufferedLineNum(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String line = super.readLine();
        if (line == null) {
            return null;
        }
        line = count + " " + line;
        count++;
        return line;
    }
}

//带分号
class BufferedSemi extends BufferedReader {
    public BufferedSemi(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String line = super.readLine();
        if (line == null) {
            return null;
        }
        line = line + ";";
        return line;
    }
}

