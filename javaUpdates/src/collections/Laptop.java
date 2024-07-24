package collections;

public class Laptop implements Comparable<Laptop>{
	String name;
	String brand;
	int ram;
	int rom;
	double price;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, String brand, int ram, int rom, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", brand=" + brand + ", ram=" + ram + ", rom=" + rom + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Laptop o) {
		return this.price>o.price?1:this.price<o.price?-1:0;
	}
	

}
