package part6.task61;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Litvv on 12.10.2016.
 */
@Component
public class MyBean2 {

    @Autowired
    MyBean myBean;

    public void getStuff() {
        myBean.doSomething();
    }
}
