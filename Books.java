package com.aggregationofbooks;

public class Books {
	private String name;
	private double price;
	private Author arr;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(String name, double price, Author arr) {
		super();
		this.name = name;
		this.price = price;
		this.arr = arr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setYear(int year) {
		this.price = price;
	}

	public Author getArr() {
		return arr;
	}

	public void setArr(Author arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "Books [name=" + name + ", price=" + price + ", arr=" + arr + "]";
	}

}
