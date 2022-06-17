package com.sample;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		String s = "Java 24 Program 56";
		
		String rep = s.replaceAll("[aeiouAEIOU]", "@");
		
		System.out.println(rep);
	}
}
