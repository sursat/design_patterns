package creational.abstractFactory;

/**
 * Created by prasad on 23/2/17.
 */
public interface AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
