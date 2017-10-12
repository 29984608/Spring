package AOP;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by pc on 2017/9/16.
 */
public class MyBook {
    public void before(){
        System.out.println("前置增强.........");
    }
    public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        //方法之前
        System.out.println("方法之前.....");
        //执行被增强的方法
        proceedingJoinPoint.proceed();
        //方法之后
        System.out.println("方法之后........");
    }
}
