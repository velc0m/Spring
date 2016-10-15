package part6.task61;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by Litvv on 11.10.2016.
 */
@Aspect
public class ExceptionHandlingAspect {

    //без этого поля будет проблема двойной рассылки писем!!!
    private Map<DatabaseRuntimeException, Integer> cache = new WeakHashMap<DatabaseRuntimeException, Integer>();

    @Value("${dbaMails}")
    private String[] mails;

    @Pointcut("execution(* part6.task61.*.*(..))")
    public void pc() {
    }

    @AfterThrowing(pointcut = "pc()", throwing = "ex")
    public void handleDBException(DatabaseRuntimeException ex) {
        if (!cache.containsKey(ex)) {
            cache.put(ex, 1);
            for (String mail : mails) {
                System.out.println("We have " + ex.getMessage() + ". Mail sent to " + mail);
            }
        }
    }
}
