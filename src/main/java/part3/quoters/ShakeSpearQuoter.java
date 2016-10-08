package part3.quoters;

import org.springframework.stereotype.Component;

/**
 * Created by LitVV on 19.06.2016.
 */
@Component
public class ShakeSpearQuoter implements Quoter {

    private String message;

    public void sayOuote() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
