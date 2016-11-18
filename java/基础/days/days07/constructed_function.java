package days07;

/**
 * Created by 40417 on 2016/11/18 0018.
 */
class Baby{
    int id;
    String name;
    {
        System.out.println("构造代码块");
    }
    public Baby(){
        cry();
    }

    public Baby(int i,String n){
        id = i;
        name = n;
        System.out.println("baby的属性初始化完毕");
        cry();
    }
    public void cry(){
        System.out.println(name+"哭..");
    }

}
public class constructed_function {
    public static void main(String[] args) {
        Baby b1 = new Baby(1,"lxw");
        new Baby();

    }
}
