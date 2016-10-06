package part1.reflections;

/**
 * Created by LitVV on 18.06.2016.
 */
public class Person {

    private String name;

    Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @RunThisMethod(repeat = 5)
    public void getHello() {
        System.out.println("Hello all!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
