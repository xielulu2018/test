package prototype;

/**
 * Created by lucas on 2018/8/6.
 */
public class ConcretePrototype1 implements Prototype {

    public ConcretePrototype1() {
        System.out.println("ConcretePrototype1");
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1();
    }
}
