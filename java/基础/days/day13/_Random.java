package day13;

import java.util.Random;

/**
 * Created by 40417 on 2016/12/1 0001.
 */
public class _Random {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(11);//产生的0-11之间
        while(true){
            num = random.nextInt(11);//产生的0-11之间
            System.out.println(num);
        }
    }



}
