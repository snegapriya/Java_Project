package com.sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Words {

	public static void main(String[] args) {
		
		String s = "by the people of the people for the people";
		
		String[] spl = s.split(" ");
		
		Map<String , Integer> m = new LinkedHashMap<String , Integer>();
			
		for (String str : spl) {
			
			if (m.containsKey(str)) { //people
				
				Integer num = m.get(str);
				m.put(str, num+1); //people=2+1 --> people=3
			} 
			
			else {

				m.put(str, 1); //for=1
			}
			
		//	System.out.println(m);
		}
		
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		
        for (Entry<String, Integer> entry : entrySet) {
			
        	if (entry.getValue()>1) {
				
        		System.out.println(entry);
			}
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
