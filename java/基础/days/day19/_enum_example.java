package day19;

/**
 * Created by 40417 on 2017/1/3 0003.
 */
//正常方法
class Gender{
    String value;
    public static final Gender man = new Gender("男");

    private Gender(String value) {
        this.value = value;
    }
}
//枚举方法
enum Gender2{
    man("男"),woman("女");

    String value;
    private  Gender2(String value) {
        this.value = value;
    }
}

enum Season{
    spring,summer,autumn,winter;
}
public class _enum_example {
    public static void main(String[] args) {
        Season season = Season.summer;
        switch (season) {
            case spring:
                System.out.println("春天");
                break;
            case summer:
                System.out.println("夏天");
                break;
            case autumn:
                System.out.println("秋天");
                break;
            case winter:
                System.out.println("冬天");
                break;
        }
    }
}
