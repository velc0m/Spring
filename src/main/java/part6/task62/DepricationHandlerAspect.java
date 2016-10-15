package part6.task62;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import part2.framework.MyDeprecated;

/**
 * Created by Litvv on 12.10.2016.
 */
@Aspect
public class DepricationHandlerAspect {

    @Around("execution((@part2.framework.MyDeprecated *) *(..))")
    public Object replaceDeprecated(ProceedingJoinPoint pjp) throws Throwable {

        String methodName = pjp.getSignature().getName();
        System.out.println("Entering - " + methodName);
        try {
            Object retVal = pjp.proceed();
            MyDeprecated annotation = retVal.getClass().getAnnotation(MyDeprecated.class);
            Object newRetVal = annotation.newClass().newInstance();
            return newRetVal;
        } finally {
            System.out.println("Exiting - " + methodName);
        }
    }
}
