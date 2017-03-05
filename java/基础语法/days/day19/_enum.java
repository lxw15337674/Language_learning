package day19;

/**
 * Created by 40417 on 2017/1/3 0003.
 */
enum Sex{
    //public static final Sex man();
    man("男"){
        @Override
        public void run() {
            System.out.println("男人在跑...");

        }
    },woman("女") {
        @Override
        public void run() {
            System.out.println("女人在跑...");
        }
    };//枚举值
    String value;//成员变量

    //构造函数
    private Sex(String value) {
        this.value = value;
    }

    //成员函数
    public void getValue(){
        System.out.println("value: "+value);
    }
    //抽象方法
    public abstract void run();
}
public class _enum {
    public static void main(String[] args) {
        Sex sex = Sex.man;
        sex.value = "男";
        sex.getValue();
        sex.run();
    }
}
