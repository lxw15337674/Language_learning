//接口关系下的多态
package day10;

interface Dao{
    public void add();
    public void delete();
}

class UserDao implements Dao{
    @Override
    public void add() {
        System.out.println("添加员工成功");
    }

    @Override
    public void delete() {
        System.out.println("删除员工成功");

    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Dao d = new UserDao();
        d.add();
    }
}
