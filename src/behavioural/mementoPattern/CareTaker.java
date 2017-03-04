package behavioural.mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prasad on 4/3/17.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
