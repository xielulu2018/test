package prototype;

/**
 * Created by lucas on 2018/8/6.
 */
public class ClientDemo {
    private Prototype prototype;
    public ClientDemo(Prototype prototype) {
        this.prototype = prototype;
    }
    public void operation(Prototype prototype) {
        prototype.clone();
    }
}
