package single;

/**
 * Created by lucas on 2018/8/6.
 */
public class EagerSingle {
    private static EagerSingle ourInstance = new EagerSingle();

    public static EagerSingle getInstance() {
        return ourInstance;
    }

    private EagerSingle() {
    }
}
