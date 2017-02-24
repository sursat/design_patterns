package creational.protoTypePattern;

/**
 * Created by prasad on 24/2/17.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
