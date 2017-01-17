package day21;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/17 0017.
 */
public class CopyImage {
    public static void main(String[] args) throws IOException {
        File inFile = new File("C:\\Users\\40417\\Desktop\\Language _learning\\java\\基础\\days\\day21\\_writer.java");
        File outFile = new File("D:\\demo1.java");

        FileReader fileReader = new FileReader(inFile);
        FileWriter fileWriter = new FileWriter(outFile);

        char[] buf = new char[1024];
        int length = 0;
        while((length = fileReader.read(buf))!=-1){
            fileWriter.write(buf,0,length);
        }
        fileWriter.close();
        fileReader.close();

    }
}
