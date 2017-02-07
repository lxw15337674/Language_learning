package basic;

/**
 * Created by 40417 on 2016/9/26 0026.
 */
public class AccessProperty {
    static int i =47;
    public void call(){
        System.out.println("调用call()方法");
        for(i=0;i<3;i++){
            System.out.print(i+" ");
            if(i==2){
                System.out.println("\n");
            }
        }
    }
    public AccessProperty(){
        i--;
        System.out.println(i);
    }

    public static void main(String[] args) {
        AccessProperty t1 = new AccessProperty();
        i = 2;
        AccessProperty t2 = new AccessProperty();
        System.out.println(i);
    }

}
