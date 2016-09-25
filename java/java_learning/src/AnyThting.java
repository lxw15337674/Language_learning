/**
 * Created by 40417 on 2016/9/26 0026.
 */
public class AnyThting {
    public AnyThting(){
        this("this 调用有参构造方法");
        System.out.println("无参构造方法");
    }
    public AnyThting(String name){
        System.out.println("有参构造方法");
    }
}
