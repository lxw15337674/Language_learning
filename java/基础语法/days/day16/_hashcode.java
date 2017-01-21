package day16;

/**
 * Created by 40417 on 2016/12/15 0015.
 */
public class _hashcode {
    public static void main(String[] args) {
        String str1 = "hello";
        String str3 = new String("hello");
        String str4 = "hello";
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());


    }

}
