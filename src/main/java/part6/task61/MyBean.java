package part6.task61;

import org.springframework.stereotype.Component;

/**
 * Created by Litvv on 11.10.2016.
 */
@Component
public class MyBean {

    public void doSomething() {
        throw new DatabaseRuntimeException("ffffff");
    }
}
