//把文件切割成几份,然后在合并起来
package day22.SequencelnputStream;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by 40417 on 2017/1/20 0020.
 */
public class _splite {
    public static void main(String[] args) throws IOException {
        cutFile();
        mergeFile();
    }

    //合并文件
    private static void mergeFile() throws IOException {
        File dir = new File("D:\\photo");
        //全部文件添加到vector中
        Vector<FileInputStream> vector = new Vector<>();
        File[] files = dir.listFiles();
        for(File file:files){
            if(file.getName().endsWith(".jpg")){
                vector.add(new FileInputStream(file));
            }
        }
        //通过Vector获取迭代器
        Enumeration<FileInputStream> e = vector.elements();
        //创建序列流
        SequenceInputStream inputStream = new SequenceInputStream(e);

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\music\\合并.jpg");
        byte[] buf = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buf))!=-1){
            fileOutputStream.write(buf,0,length);
        }
        fileOutputStream.close();
        inputStream.close();
    }

    //切割文件
    private static void cutFile() throws IOException {
        File file = new File("D:\\1.jpg");
        //目标文件夹
        File dir = new File("D:\\photo");
        //创建文件夹
        dir.mkdir();
        //建立数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲数组读取
        byte[] buf = new byte[10 * 1024];
        int length = 0;
        for (int i = 0; ((length = fileInputStream.read(buf))) != -1; i++) {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(dir, "part" + i + ".jpg"));
            fileOutputStream.write(buf, 0, length);
            fileOutputStream.close();
        }

    }


}
