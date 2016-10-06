package part1.focus;

/**
 * Created by LitVV on 19.06.2016.
 */
public class Person {

    private String firstName;
    private String family;

    public Person(String firstName, String family) {
        this.firstName = firstName;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
