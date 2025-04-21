package com.java.recall;

public class Singleton {

	private static Singleton a = null;
	
	private Singleton() {
		System.out.println("Object created");
	}
	public static Singleton getObject() {
		if(a==null) {
			a = new Singleton();
		}
		return a;
	}
	
	public static void main(String[] args) {
		Singleton sing = getObject();
		System.out.println(System.identityHashCode(sing));
		Singleton sing1 = getObject();
		System.out.println(System.identityHashCode(sing1));
	}
}
