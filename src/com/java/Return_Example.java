package com.java;

public class Return_Example {

	
	static int a;
	
	public static int demo() {

		a = 20;
		return a;
		
	//	a = 45; //we can't change the variable value after return to the method
	}
	
	public static void main(String[] args) {
		
		demo();
	}
}
