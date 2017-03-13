package Enum_and_generic;

import static java.lang.System.clearProperty;
import static java.lang.System.out;

/**
 * Created by 40417 on 2016/10/10 0010.
 */
public class EnumIndexTest1 {
    enum Constants2{
        Constants_A("我是成员A"),
        Constants_B("我是成员B"),
        Constants_C("我是成员C"),
        Constants_D(3);
        private String description;
        private int i =4;
        private Constants2(){
        }
        private Constants2(String description) {
            this.description = description;
        }
        private Constants2(int i) {
            this.i = this.i + i;
        }
        public String getDescription(){
            return description;
        }
        public int getl(){
            return i;
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<Constants2.values().length;i++){
            out.println(Constants2.values()[i]+"调用getDescription()方法:"
                    + Constants2.values()[i].getDescription());
        }
        out.println(Constants2.valueOf("Constants_D")+"调用get1()方法为:"
                    +Constants2.valueOf("Constants_D").getl());
    }
}
