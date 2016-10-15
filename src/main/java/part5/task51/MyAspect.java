package part5.task51;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Litvv on 10.10.2016.
 */
@Aspect
public class MyAspect {

    /*@Before("execution(* part4.Больница..*.оперировать(..))")
    public void beforeHospitalMethods() {
        System.out.println("Aspect here. Wo wo wo");
    }
*/

    @Before("myPoint()")
    public void beforeHospitalMethods(JoinPoint jp) {
        System.out.println("Aspect here. Wo wo wo");
        System.out.println("Method = " + jp.getSignature().getName());
    }

    @Pointcut("execution(* part4.Больница..*.оперировать(..))")
    public void myPoint() {}
}
