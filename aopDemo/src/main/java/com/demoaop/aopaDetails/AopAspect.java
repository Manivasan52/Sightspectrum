package com.demoaop.aopaDetails;

import com.demoaop.model.AopModel;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Date;

@Aspect
@Component
public class AopAspect {

    // * -> Every method in the employee controller
    // .. -> any number of parameters
    @Before(value = "execution(* com.demoaop.controller.AopController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Start time to fetch" + joinPoint.getSignature() + "the details from the DB" + new Date());
        // joinPoint.getSignature() -> it will give the name of  the method
    }

    @After(value = "execution(* com.demoaop.controller.AopController.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("end time to fetch" + joinPoint.getSignature() + "the details from the DB" + new Date());
        // joinPoint.getSignature() -> it will give the name of  the method
    }


    @Before(value = "execution(* com.demoaop.service.AopService.*(..))")
    public void beforeAdviceForServiceLayer(JoinPoint joinPoint) {
        System.out.println("Start time to fetch" + joinPoint.getSignature() + "the details from the DB" + new Date());
        // joinPoint.getSignature() -> it will give the name of  the method
    }

    @After(value = "execution(* com.demoaop.service.AopService.*(..))")
    public void afterAdviceForServiceLayer(JoinPoint joinPoint) {
        System.out.println("Start time to fetch" + joinPoint.getSignature() + "the details from the DB" + new Date());
        // joinPoint.getSignature() -> it will give the name of  the method
    }

    @AfterReturning(value = "execution(* com.demoaop.service.AopService.saveAllDetails(..))", returning = "aopModel")
    public void afterReturningAdviceForAddService(JoinPoint joinPoint, AopModel aopModel) {
        System.out.println("save details based on id " + aopModel.getId());

    }


    @AfterThrowing(value = "execution(* com.demoaop.service.AopService.saveAllDetails(..))", throwing = "exception")
    public void afterThrowingAdviceForAddService(JoinPoint joinPoint, Exception exception) {
        System.out.println("save details and it will run if exception occurs" + exception.getMessage());
    }

    @Around(value = "execution(* com.demoaop.service.AopService.saveAllDetails(..))")
    public void aroundAdviceForAddAopDetails(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("inside around advice in aspect : Business logic to save started at" + new Date());
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("inside around advice in aspect : Business logic to save the details at" + e.getMessage());

        }
        System.out.println("inside around advice in aspect : Business logic to save ended at" + new Date());


    }

}
