package part3.task32;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part3.quoters.JavaConfig;
import part3.quoters.TalkingRobotImpl;
import quoters.TalkingRobot;

/**
 * Created by Litvv on 08.10.2016.
 */
public class Main32 {

    public static void main(String[] args) {

        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context-annotations.xml");
        TalkingRobot bean = (TalkingRobot) context.getBean("talkingRobotImpl");
        bean.talk();*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        System.out.println("-------------------------");
        part3.quoters.TalkingRobot bean = context.getBean(part3.quoters.TalkingRobot.class);
        bean.talk();
    }
}
