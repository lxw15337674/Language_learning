package Enum_and_generic;

interface Constants{
    public static final int Constants_A = 1;
    public static final int Constants_B = 12;
}
public class ConstantsTest {
    enum Constants2{
        Constants_A, Constants_B
    }
    public static void doit(int c){
        System.out.println(c);
        switch (c){
            case Constants.Constants_A:
                System.out.println("doit() Constants_A");
                break;
            case Constants.Constants_B:
                System.out.println("doit() Constants_B");
                break;
        }
    }
    public static void doit2(Constants2 c){
        System.out.println(c);
        switch (c){
            case Constants_A:
                System.out.println("doit2() Constants_A");
                break;
            case Constants_B:
                System.out.println("doit2() Constants_B");
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println(Constants2.Constants_A);
        ConstantsTest.doit(Constants.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_B);
        ConstantsTest.doit(3);
    }
}
