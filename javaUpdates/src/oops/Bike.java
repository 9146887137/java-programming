package oops;

import java.io.Serializable;

public class Bike implements Serializable{
	
	private String name;
	private String model;
	private String brand;
	private int cc;
	private double price;

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(String name) {
		//constructor overloading
		/*
		 * but every time we don't need to write this user defined instructions
		 * so we use one concept called constructor chaining
		 * 
		 * we achieve constructor chaining in two ways
		 * 1.this()
		 * 2.super()
		 * 
		 * but if we want to achieve constructor chaining inside same class we use this() call statements
		 * and we want achieve constructor chaining in two class we use super() call statement
		 * 
		 * but we can't use this() call and super() inside same constructor at same time
		 * 
		 * this() call or super() must be the first statement in constructor body
		 * and we use it inside only constructor body not a outside the constructor body*/
		super();
		this.name = name;
	}
	
	public Bike(String name, String model) {
		//super();
		this(name);
		this.model = model;
	}
	public Bike(String name, String model, String brand) {
		//super();
		this(name, model);
		this.brand = brand;
	}
	
	

	public Bike(String name, String model, String brand, int cc, double price) {
		super();
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.cc = cc;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", model=" + model + ", brand=" + brand + ", cc=" + cc + ", price=" + price + "]";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Bike b=(Bike)obj;
//		System.out.println("equals");
//		return this.name==b.name&&this.model==b.model&&this.brand==b.brand&&this.cc==b.cc&&this.price==b.price;
//	}
//	@Override
//	public int hashCode() {
//		
//		//System.out.println("hashcode()");
//		return name.hashCode()+model.hashCode()+brand.hashCode()+cc+(int)price;
//	}
	
//	@Override
//	public int compareTo(Bike o) {
//			return o.price<this.price?1:o.price>this.price?-1:0;
//	}
	
	
	
	
	

}
