package quoters;

import part2.framework.MyDeprecated;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LitVV on 19.06.2016.
 */
@MyDeprecated(newClass = T1000.class)
public class TerminatorQuoter implements Quoter {

    private List<String> messages = Arrays.asList("ага ага ага");

    //@PostConstruct может не работать, т.к. необходимо добавить бин CommonAnnotationBeanPostProcessor
    //@PostConstruct
    public void sayOuote() {
        for (String message : messages) {
            System.out.println("Message = " + message);
        }
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
