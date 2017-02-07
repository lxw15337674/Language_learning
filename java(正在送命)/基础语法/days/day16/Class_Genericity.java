package day16;

/**
 * Created by 40417 on 2016/12/18 0018.
 */
class MyArrays1<T>{
    public void reverse(T[] arr){
        for(int startIndex = 0,endIndex = arr.length-1;startIndex<endIndex;startIndex++,endIndex--){
            T temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
    }

    public String toString(T[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.length;i++){
            if(i==0){
                sb.append("["+arr[i]+",");
            }else if(i==arr.length-1){
                sb.append(arr[i]+"]");
            }else{
                sb.append(arr[i]+",");
            }
        }
        return sb.toString();
    }
}
public class Class_Genericity {
    public static void main(String[] args) {
        Integer[] arr = {10,12,14,19};
        MyArrays1<Integer> arrtool = new MyArrays1<Integer>();
        arrtool.reverse(arr);
        System.out.println(arrtool.toString(arr));
    }
}

