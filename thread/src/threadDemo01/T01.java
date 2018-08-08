package threadDemo01;

/**
 * Created by lucas on 2018/8/7.
 */
public class T01 extends Thread {

    @Override
    public void run() {
        System.out.println("t01:");
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
