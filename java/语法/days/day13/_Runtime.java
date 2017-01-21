package day13;

import java.io.IOException;

/**
 * Created by 40417 on 2016/12/1 0001.
 */
public class _Runtime {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
//        Process process = runtime.exec("C:\\downloads\\CCleaner Pro v5.20 x86_x64 绿色版[增强]\\CCleaner\\CCleaner64.exe");
//        Thread.sleep(1000);
//        process.destroy();
        System.out.println("jvm空闲的内存"+runtime.freeMemory()/1024/1024);
        System.out.println("jvm试图使用的最大内存"+runtime.maxMemory()/1024/1024);
        System.out.println("jvm内存"+runtime.totalMemory()/1024/1024);

    }
}
