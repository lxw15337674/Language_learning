package 设计模式.factory;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
//创建一个工厂,生成基于给定信息的实体类的对象.
public class carFactory {
    public Car getCar(String CarType){
        if (CarType == null){
            return null;
        }
        if (CarType.equals("car1")){
            return new car1();
        }else if (CarType.equals("car2")){
            return new car2();
        }else if (CarType.equals("car3")){
            return new car3();
        }
        return null;
    }


}
