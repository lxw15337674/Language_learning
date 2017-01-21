//使用迭代器实现登录和注册功能.
package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

class User {

    int id;
    String password;

    public void setId(int id) {
        this.id = id;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.id == user.id;
    }

    @Override
    public String toString() {
        return "{" + this.id + "," + this.password + "}";
    }


}

class Operation {
    static Collection users = new ArrayList();//保存所有的账户信息.
    Scanner sc = new Scanner(System.in);

    public void sign_in() {
        User user = new User(0, null);
        System.out.println("你选择了注册功能,请输入id账号:");
        outer:
        while (true) {
            int id = sc.nextInt();
            user.setId(id);
            if (users.contains(user)) { //contains底层依赖equals方法.
                System.out.println("用户名已存在,请重新输入");
                continue;
            }
            break;
        }
        System.out.println("请输入密码");
        String password = sc.next();
        user.setPassword(password);
        users.add(user);
        System.out.println(users);//用toString输出
    }

    public void sign_up() {
        User user = new User(0, null);
        System.out.println("你选择了登录功能,请输入id账号:");
        while (true) {
            int id = sc.nextInt();
            user.setId(id);
            if (users.contains(user)) {
                System.out.println("请输入密码");
                String password = sc.next();
                user.setPassword(password);
                Iterator it = users.iterator();
                boolean flag = false;
                while (it.hasNext()) {
                    User us = (User) it.next();
                    if (us.id == user.id & us.password.equals(user.password)) {
                        System.out.println(user.id + "用户,登录成功");
                        flag = true;
                        break;
                    }

                }
                if (flag) {
                    break;
                } else {
                    System.out.println("密码错误,请重新输入id账号:");
                    continue;
                }

            } else {
                System.out.println("账号错误,请重新输入");
                continue;
            }


        }
    }

}

public class example_sign_in {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("A(注册),B(登陆),0(退出).要求:功能选择的时候要忽略大小写.");
            String option = sc.next();
            Operation operation = new Operation();
            if (option.equalsIgnoreCase("a")) {
                operation.sign_in();
            } else if (option.equalsIgnoreCase("b")) {
                operation.sign_up();
            } else if (option.equalsIgnoreCase("0")) {
                break;
            } else {
                System.out.println("输入错误请重新输入");
            }
        }


    }
}


