package MatchWildcard.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // This is where we add all of our related advices for logging

    // let's start with an @Before advice

    @Before("execution(public void add*())")
    public void beforeAddAccountAdvice() {
        System.out.println("\nExecuting @Before advice on addAccount()");
    }
}
