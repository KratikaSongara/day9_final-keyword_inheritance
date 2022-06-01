package com.ques1;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {
		
	}
	
	public Student(int roll, String name, int marks, char grade) {
		this.roll=roll;
		this.name = name;
		this.marks = marks;
		this.grade=grade;
	}

	public void displayDetails() {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no : ");
		int roll = sc.nextInt();
		student.setRoll(roll);
		
		System.out.println("Enter name : ");
		String name = sc.next();
		student.setName(name);
		
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		student.setMarks(marks);
		
		char grade = student.calculateGrade();
		student.setGrade(grade);
		
		System.out.println("roll no : "+student.getRoll());
		System.out.println("name : "+student.getName());
		System.out.println("marks : "+student.getMarks());
		System.out.println("grade : "+student.getGrade());
	}
	
	private char calculateGrade() {
		if(marks >= 500) {
			return 'A';
		}
		else if(marks < 500 && marks >= 400) {
			return 'B';
		}
		else {
			return 'C';
		}
	}
	
	@Override
	public String toString() {
		Student student = new Student();
		return roll + "-" +name + "-" + marks + "-" + grade;
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
