package com.szl.annaotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})//��ʾע��ʹ���ڲ�����
@Retention(RetentionPolicy.RUNTIME)//����ʱ����ͨ��������ƻ�ȡ
@Documented//ע�ⱻ������javadoc ��
public @interface SzlRequestParameter { 
	String value() default "";//ע���е�value

}
