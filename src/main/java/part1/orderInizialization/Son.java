package part1.orderInizialization;

/**
 * Created by LitVV on 19.06.2016.
 */
public class Son extends Parent {

    //можно добавить final
    private double pi = Math.PI;

    Son() {
        print();
    }

    @Override
    void print() {
        System.out.println("PI = " + pi);
    }
}
