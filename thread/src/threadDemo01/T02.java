package threadDemo01;

/**
 * Created by lucas on 2018/8/7.
 */
public class T02 extends Thread {
    T01 t01 ;

    public T02(T01 t01) {
        this.t01 = t01;
    }

    @Override
    public void run() {
        try {
            this.t01.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("T02:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+","+i+",");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
