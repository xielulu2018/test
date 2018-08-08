package single;

/**
 * Created by lucas on 2018/8/6.
 */
public class LazySingleton {
    private static LazySingleton  instance = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }


}
