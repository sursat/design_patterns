package behavioural.visitorPattern;

/**
 * Created by prasad on 6/3/17.
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}