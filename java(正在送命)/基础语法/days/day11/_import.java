package day11;

//编写一个计算程序运行时间的模板.
abstract class MyRuntime{
    public final void getTime(){
        long startTime = System.currentTimeMillis();//记录开始时间
        code();
        long endTime = System.currentTimeMillis();//记录结束时间
        System.out.println("运行时间:"+(endTime-startTime));
    }
    public abstract void code();

}
class template_pattern extends MyRuntime{
    public static void main(String[] args) {
        template_pattern t = new template_pattern();
        t.code();
    }
    //code方法内部写需要计算运行时间的代码
    public void code(){
        int i =0;
        while (i<100){
            System.out.println("i="+i);
            i++;
        }
    }


}
