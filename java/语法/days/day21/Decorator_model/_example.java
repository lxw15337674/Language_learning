package day21.Decorator_model;

/**
 * Created by 40417 on 2017/1/17 0017.
 */
interface Work{
    public void work();
}
public class _example {
    public static void main(String[] args) {
        Son son = new Son();
        son.work();
        Mother mother = new Mother(son);
        mother.work();
        Father father = new Father(mother);
        father.work();
    }
}


class Son implements Work{
    @Override
    public void work() {
        System.out.println("画画");
    }

}

class Mother implements Work{
    Work worker;

    public Mother(Work worker) {
        this.worker = worker;
    }

    @Override
    public void work() {
        worker.work();
        System.out.println("上涂料");
    }

}

class Father implements Work{
    Work worker;

    public Father(Work worker) {
        this.worker = worker;
    }

    @Override
    public void work() {
        worker.work();
        System.out.println("上画框");
    }

}