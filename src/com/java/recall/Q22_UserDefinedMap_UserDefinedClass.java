package com.java.recall;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q22_UserDefinedMap_UserDefinedClass {

	public static void main(String[] args) {
		Map<Integer,Q22_UserDefinedMap_Encaps> m = new LinkedHashMap<>();
		Q22_UserDefinedMap_Encaps userDefMap = new Q22_UserDefinedMap_Encaps();
		userDefMap.setStudentId(1);
		userDefMap.setStudentName("Ramesh");
		Q22_UserDefinedMap_Encaps userDefMap1 = new Q22_UserDefinedMap_Encaps();
		userDefMap1.setStudentId(2);
		userDefMap1.setStudentName("Aravind");
		m.put(1, userDefMap);
		m.put(2, userDefMap1);
		Set<Entry<Integer,Q22_UserDefinedMap_Encaps>> entrySet = m.entrySet();
		for (Entry<Integer,Q22_UserDefinedMap_Encaps> entry : entrySet) {
			System.out.println(entry.getValue().getStudentId());
			System.out.println(entry.getValue().getStudentName());
			
		}
	}
}
