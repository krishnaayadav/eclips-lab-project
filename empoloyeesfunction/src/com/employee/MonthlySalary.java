package com.employee;

import java.util.Scanner;

public class MonthlySalary {
	static MonthlyEmployee me;

	static void enterMonthlyEmployee() {

		Scanner s1 = new Scanner(System.in);
		me = new MonthlyEmployee();

		float m[] = new float[5];
		System.out.println("Enter the employee ID:");
		me.setId(s1.nextInt());
		System.out.println("Enter the employee name:");
		me.setName(s1.next());
		System.out.println("Enter the employee age:");
		me.setAge(s1.nextInt());
		System.out.println("Enter the month:");
		me.setMonth(s1.nextInt());
		System.out.println("Enter the charges:");
		me.setCharges(s1.nextInt());

		displayMonthlyEmployee();

		s1.close();

	}

	static void displayMonthlyEmployee() {

		System.out.println("ID:" + me.getId());
		System.out.println("Name:" + me.getName());
		System.out.println("Course:" + me.getAge());
		System.out.println("semester:" + me.getMonth());
		System.out.println("Division:" + me.getCharges());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the  monthly employee  details:");

		enterMonthlyEmployee();

	}

}
