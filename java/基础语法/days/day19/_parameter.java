package day19;

/**
 * Created by 40417 on 2017/1/3 0003.
 */
public class _parameter {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3,4,5);

    }
    //可变参数
    private static void add(int... arr) {
        int result = 0;
        for(int item:arr){
            result+=item;
        }
        System.out.println(result);
    }

    //固定参数
    private static void add(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }


}
