package part3.reflections;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Litvv on 06.10.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {

    int min();
    int max();
}
