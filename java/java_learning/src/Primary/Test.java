package Primary;
class Test {
    public Test(){
        System.out.println("父类Test");
    }
    protected void doSomething(){
        System.out.println("父类dosomething");
    }
    protected Test dolt(){
        System.out.println("父类dolt");
        return new Test();
    }
}
class Test2 extends Test {
    public Test2() {
        super();
        System.out.println("子类Test2");
        super.doSomething();
        super.dolt();
    }

    public void doSomethingnew() {
        System.out.println("子类dosomethingnew");
    }

    public void doSomething() {
        System.out.println("子类dosomething");
    }

    protected Test2 dolt() {
        System.out.println("子类dolt");
        return new Test2();
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println();
        test2.dolt();
    }
}

