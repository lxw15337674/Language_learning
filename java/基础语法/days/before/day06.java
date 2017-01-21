package before;

//需求:跑之前要检测轮子是否少于4个,如果少于,则要送到修理厂琉璃,.
class Car{
    String name;
    String color;
    int wheel;//轮子数
    public void run(){
        if(wheel>=4) {
            System.out.println(name+"个轮子,车启动了");
        }
        else{
            System.out.println(name+"不够4个轮子,赶快去修理");
            CarFactory f = new CarFactory();
        }
    }
        }

class CarFactory{
    String name;
    String address;
    String tel;
    //修车公共行为---返回值类型,未知的参数
    public Car repair(Car c){
        if (c.wheel>=4){
            System.out.println("不用修");
        }
        else{
            c.wheel = 4;
            System.out.println("修好了,给钱");
        }
        return c;
    }
}

public class day06 {
    public static void main(String[] args){
        Car car = new Car();
        car.name = "比亚迪";
        car.color = "黑色";
        car.wheel = 4;
        car.run();
        car.wheel = 3;
        car.run();
        CarFactory f = new CarFactory();
        f.name = "修车厂";
        f.address = "宿舍";
        f.tel = "020-12322465";
        car = f.repair(car);
        car.run();
    }
}
