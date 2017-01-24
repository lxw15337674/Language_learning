package day01;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
public class DBUtil {
    static Properties properties;
    static{
        try {
            properties = new Properties();
            //加载配置文件
            Class clazz =DBUtil.class;
            InputStream inputStream = clazz.getResourceAsStream("/db.properties");//"/"代表了Classpath的路径
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("当前路径"+new File(".").getAbsolutePath());
        System.out.println("用户名: "+properties.getProperty("username")+"\n密码:"+properties.getProperty("password"));
    }
}
