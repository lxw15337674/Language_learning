package day01.junit;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
public class tooltTest {
    @Test
    public void testgetMax(){
        int max = tool.getMax();
//        if (max!=5){
//            throw new RuntimeException();
//        }else {
//            System.out.println("最大值:"+max);
//        }
        //断言
//        Assert.assertSame(4,max);//excepted 期望 actual 真实  ==
//        Assert.assertEquals(new String("abc"),"abc"); //底层是使用Equals方法
        Assert.assertNull("aa");
        Assert.assertTrue(true);
    }
    @Test
    public void testgetMin(){
        int min = tool.getMin();
        if (min!=3){
            throw new RuntimeException();
        }else {
            System.out.println("最小值:"+min);
        }
    }
}
