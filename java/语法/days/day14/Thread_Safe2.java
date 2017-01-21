package day14;

class DeadLock extends Thread {
    public DeadLock(String name) {
        super(name);
    }

    @Override
    public void run() {
            if ("张三".equals(Thread.currentThread().getName())) {
                synchronized ("遥控器") {
                    System.out.println("张三拿到了遥控器");
                    synchronized ("电池") {
                        System.out.println("张三拿到了电池,可以开空调了 ");
                    }
                }
            } else if ("李四".equals(Thread.currentThread().getName())) {
                synchronized ("电池") {
                    System.out.println("李四拿到了电池");

                    synchronized ("遥控器") {
                        System.out.println("李四拿到了遥控器,可以开空调了");
                    }
                }
            }

    }
}

    public class Thread_Safe2 {
        public static void main(String[] args) {
            DeadLock thread1 = new DeadLock("张三");
            DeadLock thread2 = new DeadLock("李四");
            thread1.start();
            thread2.start();
        }
    }
