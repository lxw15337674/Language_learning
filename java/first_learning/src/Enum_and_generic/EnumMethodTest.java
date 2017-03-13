package Enum_and_generic;


import static java.lang.System.out;

/**
 * Created by 40417 on 2016/10/10 0010.
 */
public class EnumMethodTest {
    enum Constants2{
        Constants_A,Constants_B
    }

    private static void compare(Constants2 c) {
        for (int i=0;i<Constants2.values().length;i++){
            out.println(c+"与"+Constants2.values()[i]+"的比较结果为:"
                    +c.compareTo(Constants2.values()[i]));
        }
    }

    public static void main(String[] args) {
        compare(Constants2.valueOf("Constants_B"));
    }
}
