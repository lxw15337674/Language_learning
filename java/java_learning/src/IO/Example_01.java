package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by 40417 on 2016/10/9 0009.
 */
public class Example_01 {
    public static void main(String[] args) {
        try{
            FileOutputStream fs = new FileOutputStream("word3.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
