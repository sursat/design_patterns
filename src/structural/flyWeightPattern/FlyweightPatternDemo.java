package structural.flyWeightPattern;

/**
 * Created by prasad on 28/2/17.
 * <p>
 * Description: Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and
 * increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object
 * count thus improving the object structure of application.
 * <p>
 * Here ShapeFactory is storing the objects that are created by using color as key in Map, So if asked object is already created
 * It is just returning object from Map cuz object with that color is already created and kept in memory for future use.
 */

public class FlyweightPatternDemo {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
