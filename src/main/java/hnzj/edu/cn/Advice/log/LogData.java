package hnzj.edu.cn.Advice.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //目标类型
@Retention(RetentionPolicy.RUNTIME)//运行时生效
public @interface LogData {
    String description() default ""; //日志类型
}
