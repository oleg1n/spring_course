package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution (* get*())")
    private void allGetMethods(){}

    @Before("allGetMethods()")
    public void BeforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: try get book/magazine");
    }

    @Before("allGetMethods()")
    public void BeforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: checking rights on get book/magazine");
    }
}
