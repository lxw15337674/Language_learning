//定义一个方法可以接受任何类型的参数,而且返回值类型必须要与实参的类型一致.
package day16;

/**
 * Created by 40417 on 2016/12/18 0018.
 */
public class _Genericity2 {
    public static void main(String[] args) {
        String str = getData("aa");
        int a = getData(123);
        System.out.println(str);
        System.out.println(a);
    }

    public static <T>T getData(T o){
        return o;
    }
}
