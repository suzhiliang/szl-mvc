package com.szl.annaotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})//��ʾע��ʹ����class��
@Retention(RetentionPolicy.RUNTIME)//����ʱ����ͨ��������ƻ�ȡ
@Documented//ע�ⱻ������javadoc ��
public @interface SzlController { 
	String value() default "";//ע���е�value

}