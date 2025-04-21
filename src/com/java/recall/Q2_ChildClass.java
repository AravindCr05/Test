package com.java.recall;

public class Q2_ChildClass extends Q2_ParentClass{
	public void test2(){
		  System.out.println("Class C"); 
		}

		public static void main(String[] args){
		Q2_ChildClass c = new Q2_ChildClass();
		c.test();
		c.test1();
		c.test2();
		}
}
