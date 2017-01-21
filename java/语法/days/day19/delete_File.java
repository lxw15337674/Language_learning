package day19;

import java.io.File;

/**
 * Created by 40417 on 2017/1/4 0004.
 */
public class delete_File {
    public static void main(String[] args) {
        File file = new File("D:\\a.txt");
        System.out.println("删除成功吗?"+file.delete());

    }
}
