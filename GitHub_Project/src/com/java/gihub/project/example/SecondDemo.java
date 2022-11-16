package com.java.gihub.project.example;

import java.util.HashSet;

public class SecondDemo {

	public static void main(String[] args) {
		
		HashSet hs= new HashSet();
		hs.add("Ram");
        hs.add("Sham");
        hs.add("Kiran");
        hs.add("Puja");
        
        hs.forEach(a-> System.out.println(a));
		

	}

}
