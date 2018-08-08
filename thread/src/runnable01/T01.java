package runnable01;

/**  死锁
 * Created by lucas on 2018/8/7.
 */
class MyLock{
    static Object locka = new Object();
    static Object lockb = new Object();
}

class Test implements Runnable{

    private boolean flag;

    public Test(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
            while (true){
                synchronized (MyLock.locka){
                    System.out.println(Thread.currentThread().getName()+"if  Locka");
                    synchronized (MyLock.lockb){
                        System.out.println(Thread.currentThread().getName()+"if  Lockb");
                    }
                }
            }
        }else{
            while (true){
                synchronized (MyLock.lockb){
                    System.out.println(Thread.currentThread().getName()+"else  Lockb");
                    synchronized (MyLock.locka){
                        System.out.println(Thread.currentThread().getName()+"else  Locka");
                    }
                }
            }
        }
    }
}

public class T01 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Test(true));
        Thread t2 = new Thread(new Test(false));
        t1.start();
        t2.start();
    }
}
