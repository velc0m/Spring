package part4.task42;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    @Autowired
    Windows windows;

    @Autowired
    Wheel wheel;

    String style;

    public Car(String style) {
        this.style = style;
    }
}
