/**
 * Created by 40417 on 2016/9/26 0026.
 */
public class Summation {
    public static void main(String[] args) {
        String str[] = {"89","12","40","50","35"};
        int sum = 0;
        for(int i = 0;i<str.length;i++){
            int myint = Integer.parseInt(str[i]);
            sum+=myint;
        }
        System.out.println("和:"+sum);
    }

}
