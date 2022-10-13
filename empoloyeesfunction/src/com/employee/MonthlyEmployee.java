package com.employee;

public class MonthlyEmployee extends Employee {
	private int month;
	private float charges;

	public MonthlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MonthlyEmployee(int id, String name, int age, int month, float charges) {
		super(id, name, age);
		this.month = month;
		this.charges = charges;
	}

	public MonthlyEmployee(int month, float charges) {
		super();
		this.month = month;
		this.charges = charges;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "MonthlySalary [month=" + month + ", charges=" + charges + "]";
	}

}
