package before;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 40417 on 2016/11/14 0014.
 * 使用异或对图片数据进行加密
 */
public class ImageTest {
    public static void main(String[] args) throws IOException {
//        //加密
//        File inFile = new File("D:\\图片\\photo.jpg");
//        File outFile = new File("D:\\图片\\加密后的photo.jpg");

        //解密
        File inFile = new File("D:\\图片\\加密后的photo.jpg");
        File outFile = new File("D:\\图片\\解密后的photo.jpg");

        FileInputStream  input = new FileInputStream(inFile);
        FileOutputStream output = new FileOutputStream(outFile);

        int content = 0; //用于存储读取到的数据
        while((content = input.read())!=-1){
            output.write(content^12);
        }
        //关闭图片
        output.close();
        input.close();
    }
}
