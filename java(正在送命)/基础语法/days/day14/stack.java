package day14;

import java.util.*;

/**
 * Created by 40417 on 2016/12/4 0004.
 */
public class stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(123);
        printStack(stack);
        stack.push("abc");
        printStack(stack);
        stack.push(123.2);
        printStack(stack);

        String s = "abc";
        System.out.println("\n搜索"+stack.search(s));

        System.out.println(stack.pop());
        printStack(stack);
        System.out.println("\n输出"+stack.peek());
    }
    private static void printStack(Stack stack){
        if(stack.empty()){
            System.out.print("\n空栈");
       }else{
            System.out.print("\n栈元素:");
            Enumeration items = stack.elements();
            while(items.hasMoreElements()){
                System.out.print(items.nextElement()+" ");
            }
        }
    }


}
