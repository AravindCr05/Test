package com.java.recall;

import java.util.HashSet;
import java.util.Set;

public class Q21_UserDefinedSet_UserDefinedClass {

	public static void main(String[] args) {
		Set<Q21_UserDefinedSet_Encaps> s = new HashSet<>();
		Q21_UserDefinedSet_Encaps userDefSet = new Q21_UserDefinedSet_Encaps();
		userDefSet.setStudentId(1);
		userDefSet.setStudentName("Ramesh");
		Q21_UserDefinedSet_Encaps userDefSet1 = new Q21_UserDefinedSet_Encaps();
		userDefSet1.setStudentId(2);
		userDefSet1.setStudentName("Aravind");
		s.add(userDefSet);
		s.add(userDefSet1);
		for (Q21_UserDefinedSet_Encaps value : s) {
			System.out.println(value.getStudentId());
			System.out.println(value.getStudentName());
			
		}
	}
}
