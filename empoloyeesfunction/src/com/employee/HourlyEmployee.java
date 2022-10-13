package com.employee;

public class HourlyEmployee extends Employee {
	private int time;
	private float charges;

	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(int id, String name, int age, int time, float charges) {
		super(id, name, age);
		this.time = time;
		this.charges = charges;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public float getcharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [time=" + time + ", charges=" + charges + "]";
	}

}
