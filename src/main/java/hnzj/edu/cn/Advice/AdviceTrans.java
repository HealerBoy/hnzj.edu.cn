package hnzj.edu.cn.Advice;
import hnzj.edu.cn.service.impl.StudentServiceImpl;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AdviceTrans {
    @Pointcut("execution ( * hnzj.edu.cn.service.impl.StudentServiceImpl*(..))")
    public void pointcut(){
    }
    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("这是前置通知");
        System.out.println("目标类："+joinPoint.getTarget());
        System.out.println("目标方法："+joinPoint.getSignature().getName());
    }
    @After("pointcut()")
    public void after(){
        System.out.println("这是后置通知");
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Logger logger = Logger.getLogger(StudentServiceImpl.class);
        logger.debug("this is DEBUG message");
        logger.info("this is INFO message");
        logger.warn("this is WARN message");
        logger.error("this is ERROR message");
        logger.fatal("this is FATAL message");
        PropertyConfigurator.configure("log4j.properties");
        System.out.println("环绕之前的通知");
        Object object=proceedingJoinPoint.proceed();
        System.out.println("环绕之后的通知");
        return object;
    }
}
