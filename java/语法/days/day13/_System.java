package day13;

import com.oracle.webservices.internal.api.message.PropertySet;

import java.util.Properties;

/**
 * Created by 40417 on 2016/12/1 0001.
 */
class Person {
    String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(this.name+"被回收了.");
    }
}

public class _System {
    public static void main(String[] args) {
//        System.out.println("lol");
//        System.exit(0);
//        System.out.println("当前的系统时间:"+System.currentTimeMillis());
//        for(int i = 0 ;i<4;i++){
//            new Person("辣鸡"+i);
//            System.gc();//建议马上启动垃圾回收器
//        }
//        System.out.println("环境变量"+ System.getenv("JAVA_HOME"));
//        Properties properties = System.getProperties();//获取系统所有属性
//        properties.list(System.out);//全部输出
        String value = System.getProperty("os.name");
        System.out.println(value);
    }

}
