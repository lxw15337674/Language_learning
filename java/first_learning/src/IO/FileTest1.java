package IO;

import java.io.File;
import java.io.IOException;

/**
 * Created by 40417 on 2016/10/8 0008.
 */
public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("word.txt");
        if(file.exists()){
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();
            System.out.println(name);
            System.out.println(length);
            System.out.println(hidden);
        }else{
            System.out.println("不存在");
            file.createNewFile();
        }
    }
}
