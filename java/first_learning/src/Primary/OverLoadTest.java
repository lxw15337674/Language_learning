package Primary;

/**
 * Created by 40417 on 2016/9/27 0027.
 */
public class OverLoadTest {
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int a){
        return a;
    }
    public static int add(int a,double b){
        return 1;
    }
    public static int add(double a,int b){
        return 1;
    }
    public static int add(int...a){
        int s = 0;
        for(int b:a){
            s+=b;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(2.1,3.3));
        System.out.println(add(3));
        System.out.println(add(3,2.5));
        System.out.println(add(2,3,4,5,6,7,8));
    }

}
