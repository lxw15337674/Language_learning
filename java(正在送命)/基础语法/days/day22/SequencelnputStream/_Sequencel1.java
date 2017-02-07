package day22.SequencelnputStream;

import java.io.*;

/**
 * Created by 40417 on 2017/1/20 0020.
 */
public class _Sequencel1 {
    public static void main(String[] args) throws IOException {
        merge2();
    }
    //用SequenceInputStream把两个文件合并成一个文件
    public static void merge2() throws IOException {
        File infile1 = new File("D:\\a.txt");
        File infile2 = new File("D:\\b.txt");
        File outfile = new File("D:\\c.txt");

        FileInputStream fileInputStream1 = new FileInputStream(infile1);
        FileInputStream fileInputStream2 = new FileInputStream(infile2);
        FileOutputStream fileOutputStream = new FileOutputStream(outfile);
        //建立序列流对象
        SequenceInputStream inputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
        byte[] buf = new byte[1042];
        int length = 0;

        while ((length = inputStream.read(buf)) != -1) {
            fileOutputStream.write(buf, 0, length);
        }
        //关闭资源
        inputStream.close();
        fileOutputStream.close();
    }
}
