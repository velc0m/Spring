package part6.task62;

import org.springframework.stereotype.Component;

/**
 * Created by Litvv on 12.10.2016.
 */
@Component
public class SkyNet implements TerminatorFactory {

    public Terminator createTerminator() {
        return new Terminator();
    }

    @PostInizialized
    public void methodsForAnnotation() {
        System.out.println("I was Found by Listener. Ahhhhhh");
    }
}
