package Primary;

/**
 * Created by 40417 on 2016/9/28 0028.
 */
public class Shoot {
    static void pop() throws NegativeArraySizeException{
        int[] arr = new int[-3];
    }

    public static void main(String[] args) {
        try{
            pop();
        }
        catch (NegativeArraySizeException e){
            System.out.println("异常");
        }
    }
}
