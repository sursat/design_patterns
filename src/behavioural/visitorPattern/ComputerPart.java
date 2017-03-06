package behavioural.visitorPattern;

/**
 * Created by prasad on 6/3/17.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
