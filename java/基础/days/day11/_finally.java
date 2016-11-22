package day11;

import java.io.*;
import java.util.logging.FileHandler;

/**
 * Created by 40417 on 2016/11/22 0022.
 */
public class _finally {
    public static void main(String[] args){
        FileReader fileReader = null;
        try {
            //找到目标文件
            File file = new File("D:\\a.txt");
            //建立程序与文件的数据管道
            fileReader = new FileReader(file);
            //读取文件
            char[] buf = new char[1024];
            int length = 0;
            length = fileReader.read(buf);
            System.out.println(new String(buf,0,length));
        }catch (IOException e){
            System.out.println("读取失败");
        }finally {
            try {
                //关闭资源
                fileReader.close();
                System.out.println("释放资源成功");
            }catch (IOException e){
                System.out.println("释放资源失败");
            }
        }
        //第二种方式:不用捕获异常
        try{
            System.out.println("lol");
        }finally {
            System.out.println("123");
        }


    }
}