package day19;

import java.io.File;

/**
 * Created by 40417 on 2017/1/4 0004.
 */
public class _File {
    public static void main(String[] args) {
        File file = new File("D:\\a.txt");
        System.out.println("存在吗?"+file.exists());

        File parentFile = new File("F:\\");
        File file2 = new File(parentFile,"a.txt");
        System.out.println("存在吗?"+file2.exists());

        System.out.println("目录分隔符: "+ File.separator);

        File file3 = new File(".");
        System.out.println("当前路径: "+file3.getAbsolutePath());

        File file4 = new File("../../a.txt");
        System.out.println("当前路径: "+file4.getAbsolutePath());


    }


}
