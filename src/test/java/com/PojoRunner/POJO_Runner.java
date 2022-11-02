package com.PojoRunner;

import com.POJOcls.PojoTopic;

public class POJO_Runner {

	public static void main(String[] args) {
		
		PojoTopic obj = new PojoTopic();
		obj.setAge(23);
		obj.setName("silambarasan");
		
		obj.getAge();
		System.out.println(obj.getAge());
		
		obj.getName();
		System.out.println(obj.getName());
	}
}
