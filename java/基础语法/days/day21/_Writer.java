package day21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/17 0017.
 */
public class _Writer {
    public static void main(String[] args) throws IOException {
        writteTest1();
    }
    public static void writteTest1() throws IOException {
        File file = new File("D:/a.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        String data = "今天天气非常好";
        fileWriter.write(data);
        fileWriter.close();

    }
}
