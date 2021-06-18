package com.upgrad.course.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class loggingAspect {

    @Around("execution(* com.upgrad.course.demo..*(..))")
    public  Object applyLogging(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        System.out.println("In " + className + ", entering" + methodName);

        Object result = proceedingJoinPoint.proceed();

        System.out.println("In " + className + ", existing" + methodName);

        return result;

    }
}
