package basic;

/**
 * Created by 40417 on 2016/9/24 0024.
 */
public class Arith {
    public static void main(String[] args) {
        int a = 4;
        int b = ++a;//a=a+1,b=a
        System.out.println(a+" "+b);
        a = 4;
        b = a++;//b=a,a=a+1
        System.out.println(a+" "+b);

    }
}
