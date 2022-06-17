package com.sample;

public class Return_Ex {

	 static int age;
	 
	 public static int demo() {

		age = 20;
		return age;
		
	//	age = 50;  //we can't change the variable value after return to the method
	}
	 
	 public static void main(String[] args) {
		
		 demo();
	}
}
