package com.java.recall;

public class Q23_Throw_ParentClass {
	static int age =18;
	public static void main(String[] args) throws Q23_Throw_UserDefinedExceptionClass {
		if(age>=18) {
			System.out.println("Valid age");
		}
		throw new Q23_Throw_UserDefinedExceptionClass();
	}
}
