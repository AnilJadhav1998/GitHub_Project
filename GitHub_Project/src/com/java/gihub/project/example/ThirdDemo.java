package com.java.gihub.project.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ThirdDemo {

	public static void main(String[] args) {
		
		HashMap hs= new HashMap();
		hs.put("TCS", 20);
		hs.put("IBM", 15);
        hs.put("Wipro", 30);
        hs.put("Capgemini", 40);
        
          Set set =hs.keySet();
          Iterator itr=set.iterator();
          while(itr.hasNext()) 
          {
        	 Object key = itr.next();
        	 
              System.out.println("Key is :" +key);
              System.out.println("Value is :" +hs.get(key));
          }
	}
}
