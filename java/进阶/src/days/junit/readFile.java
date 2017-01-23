package days.junit;

import org.junit.*;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
public class readFile {
    @BeforeClass
    public static void beforeRead(){
        System.out.println("准备测试环境成功..");
    }

    @Test
    public void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\a.txt");
        int content = fileInputStream.read();
        System.out.println("内容:"+ content);
    }

    @Test
    public void sort(){
        System.out.println("排序");
    }

    @AfterClass
    public static void afterRead(){
        System.out.println("清理测试环境..");
    }



}
