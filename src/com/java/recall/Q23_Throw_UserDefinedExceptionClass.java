package com.java.recall;

public class Q23_Throw_UserDefinedExceptionClass extends Exception{

	String exceptionmsge = "Invalid age";
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return exceptionmsge;
	}
}
