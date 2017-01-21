package day17;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 40417 on 2016/12/29 0029.
 */
public class _Arrays {
    public static void main(String[] args) {
        Integer[] arr = {10, 8, 6, 4};
        Integer[] arr2 = Arrays.copyOf(arr, 6);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {10, 8, 6, 4};
        int[] arr4 = Arrays.copyOf(arr3, 6);
        System.out.println(Arrays.toString(arr4));

        Integer[] arr5 = Arrays.copyOfRange(arr, 1,3);
        System.out.println(Arrays.toString(arr5));

        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
