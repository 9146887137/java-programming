package annonymousInnerClass;

public class Student {

	String name;
	String address;
	int age;
	long phone;
	double percentage;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address, int age, long phone, double percentage) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + ", phone=" + phone + ", percentage="
				+ percentage + "]";
	}
	
	
}
