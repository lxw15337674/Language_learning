package basic;

import java.util.Random;

/**
 * Created by 40417 on 2016/9/26 0026.
 */
public class MathRandom {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt());
        }
    }
}
