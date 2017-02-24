package creational.protoTypePattern;

/**
 * Created by prasad on 24/2/17.
 * <p>
 * Prototype pattern is used to  clone a object(create new object from existing) to avoid costly object creation operation
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        //Refer ShapeCache
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
