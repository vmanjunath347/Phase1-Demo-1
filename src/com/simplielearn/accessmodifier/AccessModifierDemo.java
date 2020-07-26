package com.simplielearn.accessmodifier;

class Person{
	// member variable
	private int age = 40;
	
	protected double salary = 100099.90;
	
	//member method
	void showAge() {
		System.out.println("Age is 40");
	}
	
	public int getAge() {
		return age;
	}
	
	protected double getSalary() {
		return salary;
	}
	
}

public class AccessModifierDemo {
	
	// start point of code execution
	public static void main(String[] args) {
		PersonData person =  new  PersonData();
		
		System.out.println("The age is  : "+person.getAge());
		person.showAge();
		
		
		System.out.println("The Salary is  : "+person.salary);

	}

}
