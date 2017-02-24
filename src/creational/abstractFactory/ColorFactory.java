package creational.abstractFactory;


/**
 * Created by prasad on 23/2/17.
 */
public class ColorFactory implements AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null || color.isEmpty())
            return null;
        else if (color.equalsIgnoreCase("RED"))
            return new Red();
        else if (color.equalsIgnoreCase("BLUE"))
            return new Blue();
        else if (color.equalsIgnoreCase("GREEN"))
            return new Green();
        else
            return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
