package Enum_and_generic;

import static java.lang.System.out;

/**
 * Created by 40417 on 2016/10/10 0010.
 */
public class EnumIndexTest {
    enum Constants2{
        Constants_A,Constants_B,Constants_C
    }

    public static void main(String[] args) {
        for(int i=0;i< Constants2.values().length;i++){
            out.println(Constants2.values()[i]+"索引值"
                    +Constants2.values()[i].ordinal());
        }
    }
}
