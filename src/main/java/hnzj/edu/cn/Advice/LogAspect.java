package hnzj.edu.cn.Advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect//切面注解
public class LogAspect {
    //定义切入点
    @Pointcut("@annotation(log.LogData)")
    public void pointcut(){

    }
    @Before("pointcut()")
    public void log(JoinPoint joinPoint){
        System.out.println("进入日志Aspect");
    }
}
