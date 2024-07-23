package array;

import java.io.Serializable;

import java.util.Comparator;

public class Student {

	public String name;
	public int age;
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+name+" Age:"+age;
	}
	
	public int compareTo(Student o) {
		//System.out.println("hii");
		return o.age<this.age?1:o.age>this.age?-1:0;	
		
	}
}
