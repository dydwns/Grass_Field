package com.example.demo;

public class BeanFactory {
public Object getBeanObject(String beanName) {
	if(beanName.equals("Samsung")) {
		return new SamsungTV();
	}else if(beanName.equals("lg")) {
		return new LgTV(); //객체생성 리턴
	}
	return null;
}
}
