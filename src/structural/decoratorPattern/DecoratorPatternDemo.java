package structural.decoratorPattern;

/**
 * Created by prasad on 28/2/17.\
 * <p>
 * Description: Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
 * <p>
 * In This case RedShapeDecorator is acting as decorator for Shape object by adding additional functionality 'border color' to draw method
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
