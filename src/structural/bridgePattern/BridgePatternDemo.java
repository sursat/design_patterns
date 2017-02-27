package structural.bridgePattern;

/**
 * Created by prasad on 27/2/17.
 * <p>
 * Description: Bridge pattern is useful for de-coupling an abstraction from its implementation so that two can very independent.
 * Here DrawAPI acts as bridge for decoupling 'Shape' abstraction class from its from child class Circle. (draw method in Shape is
 * a abstract class where as Circle class which is a subclass of Shape have independent definition for method draw() which inherited from Shape class.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
