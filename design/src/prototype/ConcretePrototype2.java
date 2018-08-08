package prototype;

/**
 * Created by lucas on 2018/8/6.
 */
public class ConcretePrototype2 implements Prototype {
    public ConcretePrototype2() {
        System.out.println("ConcretePrototype2");
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2();
    }
}
