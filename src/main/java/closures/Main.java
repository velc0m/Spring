package closures;

import focus.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by LitVV on 13.07.2016.
 */
public class Main {

    public static void main(String[] args) {

        List<Person> strings = new ArrayList<Person>();
        strings.add(new Person("Valera", "Brus"));
        strings.add(new Person("Semen", "Brus"));
        strings.add(new Person("Anna", "Brus"));

        Collections.sort(strings, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });
    }
}
