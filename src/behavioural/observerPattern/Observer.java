package behavioural.observerPattern;

/**
 * Created by prasad on 4/3/17.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
