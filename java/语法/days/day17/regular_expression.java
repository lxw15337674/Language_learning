package day17;

/**
 * Created by 40417 on 2017/1/2 0002.
 */
public class regular_expression {
    public static void main(String[] args) {
        System.out.println("%".matches("."));
        System.out.println("12".matches("\\d"));

        System.out.println("12".matches("\\d?"));


    }
}
