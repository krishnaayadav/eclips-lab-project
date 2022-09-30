package com.aggregationofbooks;

public class Library {

	static void display(Books b) {

		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		Books b1 = new Books("The India Story", 850.50d, new Author("Bimal", "jalal"));
		Books b2 = new Books("Listen to Your Heart: The London Adventure", 700.50d, new Author("Ruskin", "Bond"));
		Books b3 = new Books("Business of Sports: The Winning Formula for Success", 1050.68d,
				new Author("Vinit", "Karnik"));
		System.out.println("Details are:");

		display(b1);
		display(b2);
		display(b3);

	}

}
