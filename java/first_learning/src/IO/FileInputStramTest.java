package IO;

import java.io.*;

/**
 * Created by 40417 on 2016/10/8 0008.
 */
public class FileInputStramTest {
    public static void main(String[] args) {
        File file = new File("word.txt");
        try{
            FileOutputStream out = new FileOutputStream(file);
            byte buy[] = "我是李希望".getBytes();
            out.write(buy);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = in.read(byt);
            System.out.println("信息:"+new String(byt,0,len));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
