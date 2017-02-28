package structural.proxyPattern;

/**
 * Created by prasad on 28/2/17.
 * <p>
 * Description: In proxy pattern, a class represents functionality of another class.
 * Here ProxyImage is representing functionality of another class called RealImage.
 * <p>
 * The motivation here is to avoid costly object creation unless it's really needed.
 * Here assume RealImage object is costly where as ProxyImage object is light weight object which can create RealImage object only when it needed
 * for specific functionality.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
