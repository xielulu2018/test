package builder;

/**
 * Created by lucas on 2018/8/6.
 */
public class ConcreteBuilder implements Builder {
    Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("编号：12345");
    }

    @Override
    public void buildPart2() {
        product.setPart2("类型：321");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
