package creational.BuilderPattern;

/**
 * Created by prasad on 24/2/17.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
