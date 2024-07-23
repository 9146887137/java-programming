package java8updates;

import java.util.Objects;

public class Bike {
	
	@Override
	public String toString() {
		return "Bike [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	String name;
	String brand;
	double price;

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(String name, String brand, double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		Bike b=(Bike)obj;
		return this.name==b.name&&this.brand==b.brand&&this.price==b.price;
	}
	
}
