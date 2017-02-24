package creational.BuilderPattern;

/**
 * Created by prasad on 24/2/17.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
