/**
 * Created by 40417 on 2016/9/26 0026.
 */
public class StaticTest {
    static double PI =3.1415;
    static int id = 2;
    public static void method1(){
        System.out.println("静态方法");
    }
    public void method2(){
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
        StaticTest.method1();
    }
    public static StaticTest method3(){
        method2();
        return this;
    }
}
