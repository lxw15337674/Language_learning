package IO;

import java.io.File;

/**
 * Created by 40417 on 2016/10/8 0008.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("word.txt");
        if (file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }else{
            try{
                file.createNewFile();
                System.out.println("已创建");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
