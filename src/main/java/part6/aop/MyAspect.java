package part6.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Litvv on 11.10.2016.
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* part6.prostotak.*.*(..))")
    public void pc() {}

    @AfterReturning(pointcut = "pc()", returning = "retVal")
    public void printReturningValue(int retVal) {
        System.out.println("After returning - " + retVal);
    }
}
