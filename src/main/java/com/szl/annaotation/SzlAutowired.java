package com.szl.annaotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})//��ʾע��ʹ���ڳ�Ա������
@Retention(RetentionPolicy.RUNTIME)//����ʱ����ͨ��������ƻ�ȡ
@Documented//ע�ⱻ������javadoc ��
public @interface SzlAutowired { 
	String value() default "";//ע���е�value

}
