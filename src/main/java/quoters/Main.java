package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LitVV on 19.06.2016.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        TalkingRobot talkingRobot = context.getBean(TalkingRobot.class);
        talkingRobot.talk();

        //По классу но будет Exception, т.к. есть две реализации интерфейса
        //Quoter bean0 = context.getBean(Quoter.class);

        //По id, но необходимо указать конкретный класс
        //Quoter bean1 = context.getBean("terminatorQuoter", TerminatorQuoter.class);

        //Необходимо каставать, если по id
        //ShakeSpearQuoter bean5 = (ShakeSpearQuoter) context.getBean("shakeSpearQuoter");

        //TerminatorQuoter bean6 = context.getBean(TerminatorQuoter.class);

        //bean6.sayOuote();

        //Достаем все бины одного типа
        /*Map<String, Quoter> map = context.getBeansOfType(Quoter.class);
        Collection<Quoter> quoters = map.values();

        for (Quoter quoter : quoters) {
            quoter.sayOuote();
        }*/

        //System.out.println(context.getBean(Person.class));
    }
}
