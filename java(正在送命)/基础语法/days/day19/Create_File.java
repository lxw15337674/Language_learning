package day19;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/4 0004.
 */
public class Create_File {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/b.txt");
        System.out.println("创建成功否?"+file.createNewFile());

        File dir = new File("D:/AAA");
        System.out.println(dir.mkdir());

    }
}
