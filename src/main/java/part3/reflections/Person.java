package part3.reflections;

/**
 * Created by LitVV on 18.06.2016.
 */
public class Person {

    private String name;

    @Inject(min = 15, max = 75)
    private int age;

    Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
