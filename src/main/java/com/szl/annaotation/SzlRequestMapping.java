package com.szl.annaotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})//表示注解使用在class上和方法上
@Retention(RetentionPolicy.RUNTIME)//运行时可以通过反射机制获取
@Documented//注解被保函在javadoc 中
public @interface SzlRequestMapping { 
	String value() default "";//注解中的value

}
