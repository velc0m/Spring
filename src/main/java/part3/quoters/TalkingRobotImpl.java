package part3.quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import part3.framework.BenchMark;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by LitVV on 19.06.2016.
 */
@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired
    private List<Quoter> quoters;

    @BenchMark
    @PostConstruct
    public void talk() {
        for (Quoter quoter : quoters) {
            quoter.sayOuote();
        }
    }

    @BenchMark
    public void tellStory() {
        System.out.println("This is my story - .....!!!!!");
    }

    public void sskMe() {
        System.out.println("Ask me a question - please!");
    }

    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }
}

