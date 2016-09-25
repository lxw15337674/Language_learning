import java.util.Arrays;

/**
 * Created by 40417 on 2016/9/25 0025.
 */
public class Rakel {
    public static void main(String[] args) {
        String str[] = new String[]{"d","a","3","h"};
        Arrays.sort(str);
        for(String a:str){
            System.out.println(a);
        }
        int index = Arrays.binarySearch(str,0,2,"h");
        System.out.println(index);
    }
}
