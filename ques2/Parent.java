package com.ques2;

public class Parent {

	final int number;
	
	public Parent(int num) {
		number=num;
	}
	
	void method1() {
		System.out.println(number);
		System.out.println("method 1 of parent class");
	}
	
	final void method2() {
		System.out.println("method 2 of parent class");
	}
	
	protected void method3() {
		System.out.println("method 3 of parent class");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
