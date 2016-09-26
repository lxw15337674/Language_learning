package basic;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by 40417 on 2016/9/26 0026.
 */
public class Compare {
    public static void main(String[] args) {
        String c1 = new String("abc");
        String c2 = new String("abc");
        String c3 = c1;
        System.out.println("c2==c3的运算结果为:"+(c2==c3));
        System.out.println("c2.equals(c3)的运算结果为:"+(c2.equals(c3)));
    }
}
