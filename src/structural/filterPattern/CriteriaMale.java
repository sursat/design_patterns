package structural.filterPattern;

/**
 * Created by prasad on 27/2/17.
 * <p>
 * Description: Filter pattern or Criteria pattern is a design pattern that enables developers
 * to filter a set of objects using different criteria and chaining them in a decoupled way through logical operations
 */

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
