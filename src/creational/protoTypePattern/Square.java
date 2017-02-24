package creational.protoTypePattern;

/**
 * Created by prasad on 24/2/17.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
