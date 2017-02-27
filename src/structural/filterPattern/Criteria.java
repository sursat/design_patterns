package structural.filterPattern;

/**
 * Created by prasad on 27/2/17.
 */

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
