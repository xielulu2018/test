package builder;

/**
 * Created by lucas on 2018/8/6.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
