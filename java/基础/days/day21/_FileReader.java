package day21;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/5 0005.
 */
public class _FileReader {
    public static void main(String[] args) throws IOException {
        readTest1();
    }
    public static void readTest1() throws IOException {
        File file = new File("D:/a.txt");
        FileReader fileReader = new FileReader(file);
        int content = 0;
        while((content = fileReader.read())!=-1){
            System.out.print((char)content);
        }
        fileReader.close();
    }
}
