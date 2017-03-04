package behavioural.mementoPattern;

/**
 * Created by prasad on 4/3/17.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

