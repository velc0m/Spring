package part3.framework;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by LitVV on 21.07.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDeprecated {
    Class newClass();
}
