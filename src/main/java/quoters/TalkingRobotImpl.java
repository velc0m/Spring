package quoters;

import part2.framework.BenchMark;
import part2.framework.Transaction;

import java.util.List;

/**
 * Created by LitVV on 19.06.2016.
 */
public class TalkingRobotImpl implements TalkingRobot {

    private List<Quoter> quoters;

    //BenchMark для Шекспира будет работать, т.к. здесь идет явный вызов quoter.sayOuote(), если, например, поставить @RunThisMethod в Теринаторе,
    //то не сработает, т.к. BenchMark рабоатет в postProcessBeforeInitialization
    @BenchMark
    @Transaction
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

