package com.ques2;

import java.util.Scanner;

public final class Child extends Parent{

	public Child(int num) {
		//IMPORTANT : as parent class has parameterized constructor, that's why, in my child constructor I need to pass super with same parameters as they are in parent class' parameterized constructor else my child class constructor will have super() and since there is no zero argument constructor in parent class, it will throw error and it will not load the parameterized constructor of the parent class.
		super(num);
		method1();
	}
	
	@Override
	void method1() {
		if(number>=1 && number<=10)
		{
			System.out.println(number);
			System.out.println("overridden method 1 of parent class");
		}
		else
		{
			System.out.println("Invalid number");
			System.out.println("overridden method 1 of parent class");
		}
	}
	
	final void method4() {
		System.out.println("method 4 of child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer from 1 to 10 : ");
		int num = sc.nextInt();
		
		Parent parent1 = new Child(num);
		parent1.method1();
		parent1.method2();
		parent1.method3();
		
		Child child = (Child)parent1;
		child.method4();
	}

}
