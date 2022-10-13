package com.employee;

import java.util.Scanner;

public class Hourlysalary {
	static HourlyEmployee he;

	static void enterHourlyEmployee() {

		Scanner sc1 = new Scanner(System.in);
		he = new HourlyEmployee();

		float m[] = new float[3];
		System.out.println("Enter the student ID:");
		he.setId(sc1.nextInt());
		System.out.println("Enter the student name:");
		he.setName(sc1.next());
		System.out.println("Enter the student age:");
		he.setAge(sc1.nextInt());
		System.out.println("Enter the month:");
		he.setTime(sc1.nextInt());
		System.out.println("Enter the charges:");
		he.setCharges(sc1.nextInt());

		displayHourlyEmployee();

		sc1.close();

	}

	static void displayHourlyEmployee() {

		System.out.println("ID:" + he.getId());
		System.out.println("Name:" + he.getName());
		System.out.println("Class:" + he.getAge());
		System.out.println("Percentage:" + he.getTime() + "%");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the hourly employee details:");

		enterHourlyEmployee();

	}

}
