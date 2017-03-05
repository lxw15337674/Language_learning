package day11;

import java.security.acl.AclNotFoundException;

/**
 * Created by 40417 on 2016/11/22 0022.
 */
public class _error {
    public static void main(String[] args)
    {
        div(4,0);
    }
    public static void div(int a,int b)
    {
        int c =a/b;
        System.out.println("c="+c);
    }
}

