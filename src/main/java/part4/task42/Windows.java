package part4.task42;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Windows {

    boolean tone = true;
    @Value("4")
    int count;
}
