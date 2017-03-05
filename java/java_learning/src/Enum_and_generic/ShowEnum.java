package Enum_and_generic;

import Enum_and_generic.ConstantsTest.Constants2;

import static java.lang.System.out;

/**
 * Created by 40417 on 2016/10/10 0010.
 */
public class ShowEnum {
    enum Constant2{
        Constants_A,Constant_B,qwe,u8
    }

    public static void main(String[] args) {
        for (int i=0;i<Constant2.values().length;i++){
            out.println("成员变量:"+Constant2.values()[i]);
        }
    }
}
