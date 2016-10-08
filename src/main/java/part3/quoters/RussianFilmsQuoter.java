package part3.quoters;

import org.springframework.stereotype.Component;

/**
 * Created by Litvv on 08.10.2016.
 */
@Component
public class RussianFilmsQuoter implements Quoter {

    public void sayOuote() {
        System.out.println("Москва слезам не верит");
    }
}
