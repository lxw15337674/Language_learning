package day22.SequencelnputStream;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by 40417 on 2017/1/18 0018.
 */
//需求:把a.txt与b.txt文件的内容合并
public class normal {
    public static void main(String[] args) throws IOException {
        merge1();
    }
    public static void merge1() throws IOException {
        File infile1 = new File("D:\\a.txt");
        File infile2 = new File("D:\\b.txt");
        File outfile = new File("D:\\c.txt");

        FileInputStream fileInputStream1 = new FileInputStream(infile1);
        FileInputStream fileInputStream2 = new FileInputStream(infile2);
        FileOutputStream fileOutputStream = new FileOutputStream(outfile);
        //把输入流存储到集合中,然后再从集合中读取
        ArrayList<FileInputStream> list = new ArrayList<>();
        list.add(fileInputStream1);
        list.add(fileInputStream2);

        //创建一个缓冲数组
        byte[] buf = new byte[1024];
        int length = 0;

        for (int i=0;i<list.size();i++){
            FileInputStream fileInputStream = list.get(i);
            while ((length = fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf,0,length);
            }
            //关闭资源
            fileInputStream.close();
        }
        fileOutputStream.close();

    }
}
