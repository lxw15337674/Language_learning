package Primary;
import static java.lang.System.out;
import java.util.Random;
/**
 * Created by 40417 on 2016/9/28 0028.
 */
class Test3{
    int i =0;
}
public class FinalData {
    static Random rand = new Random();
    private final int VALUE_1 = 9;
    private static final int VALUE_2 = 10;
    private final Test3 test = new Test3();
    private Test3 test2 = new Test3();
    static int[] a ={1,2,3,4,5,6};
    private final int i4 = rand.nextInt(20);
    private static final int i5 = rand.nextInt(20);
    public String tostring(){
        return i4+" "+i5+" ";
    }
    public static void main(String[] args) {
        FinalData data = new FinalData();
        data.test2 = new Test3();
        for (int i =0;i<data.a.length;i++){
            a[i] = 9;
        }
        out.println(data);
        out.println("data2");
        out.println(new FinalData());
        out.println(data);
        for(int i:a){
            out.print(i);
        }
    }
}
