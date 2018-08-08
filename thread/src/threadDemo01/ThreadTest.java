package threadDemo01;

/**
 * Created by lucas on 2018/8/7.
 * t03执行前t02完成，t02执行前t01完成，通过join方法实现
 */
public class ThreadTest{
    public static void main(String[] args) {
        T01 t01 = new T01();
        T02 t02 = new T02(t01);
        T03 t03 = new T03(t02);
        t01.start();
        t02.start();
        t03.start();
    }
}
