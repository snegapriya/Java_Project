package com.programs;

public class Pojo_B {

	public static void main(String[] args) {
		
		Pojo_A a = new Pojo_A();
		int age = a.getAge();
		System.out.println(age);
		
		a.setAge(50);
		
		int age2 = a.getAge();
		System.out.println(age2);
		
		a.setAge(75);
		
		int age3 = a.getAge();
		System.out.println(age3);
	}
}
