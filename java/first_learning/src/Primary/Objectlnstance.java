package Primary;

/**
 * Created by 40417 on 2016/9/27 0027.
 */
public class Objectlnstance {
    public String toString(){
        System.out.println(getClass());
        System.out.println(getClass().getName());
        return"在"+getClass().getName()+"类中重写toString()方法";
    }

    public static void main(String[] args) {
        System.out.println(new Objectlnstance());
    }
}
