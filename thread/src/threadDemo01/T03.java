package threadDemo01;

/**
 * Created by lucas on 2018/8/7.
 */
public class T03 extends Thread {
    T02 t02 ;

    public T03(T02 t02) {
        this.t02 = t02;
    }

    @Override
    public void run() {
        try {
            this.t02.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("T03:");
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
