package 设计模式.factory;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
public class Demo {
    public static void main(String[] args) {
        carFactory cf = new carFactory();

        Car car1 = cf.getCar("car1");

        car1.car();


    }
}
