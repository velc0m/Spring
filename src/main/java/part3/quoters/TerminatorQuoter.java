package part3.quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import part3.framework.MyDeprecated;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LitVV on 19.06.2016.
 */
@MyDeprecated(newClass = T1000.class)
@Component
public class TerminatorQuoter implements Quoter {

    //private List<String> messages = Arrays.asList("ага ага ага");

    private List<String> messages;

    //@PostConstruct может не работать, т.к. необходимо добавить бин CommonAnnotationBeanPostProcessor
    //@PostConstruct
    public void sayOuote() {
        for (String message : messages) {
            System.out.println("Message = " + message);
        }
    }

    @Value("${terminatorQuotes}")
    public void setMessages(String[] messages) {
        this.messages = Arrays.asList(messages);
    }
}
