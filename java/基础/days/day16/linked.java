package day16;

//使用linkedlist存储一副扑克牌,然后实现洗牌功能.

import java.util.LinkedList;
import java.util.Random;

class Poker{
    String color;
    String num;
    public Poker(String color,String num){
        this.color = color;
        this.num = num;
    }

    @Override
    public String toString() {
        return  "{"+color+num+"}";
    }
}

public class linked {
    public static void main(String[] args) {
        LinkedList pokers = createPoker();
        System.out.println(pokers);
        System.out.println(pokers.size());
        shufflePoker(pokers);
        System.out.println(pokers);
    }

    //洗牌的功能
    public static void shufflePoker(LinkedList pokers){
        //创建随机数对象
        Random random = new Random();
        //随机产生两个索引值
        for(int i=0;i<100;i++) {
            int index1 = random.nextInt(pokers.size());
            int index2 = random.nextInt(pokers.size());
            //根据索引值取出两张牌,然后交换两张牌的顺序.
            Poker poker1 = (Poker) pokers.get(index1);
            Poker poker2 = (Poker) pokers.get(index2);
            pokers.set(index1, poker2);
            pokers.set(index2, poker1);
        }
    }

    //显示扑克牌
    public static void showPoker(LinkedList pokers){
        for (int i=0;i<pokers.size();i++){
            System.out.print(pokers.get(i));
            //换行
            if(i%10==9){
                System.out.println();
            }
        }
    }

    //生成扑克牌
    public static LinkedList createPoker(){
        //存储扑克对象
        LinkedList list = new LinkedList();
        //定义数组存储所有的花色与点数
        String[] colors = {"黑桃","红桃","梅花","方块"};
        String[] nums = {"A","2","3","4","5"};
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<colors.length;j++){
                list.add(new Poker(colors[j],nums[i]));
            }
        }
        return list;
    }
}
