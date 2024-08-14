package array;

import java.io.Serializable;

import java.util.Comparator;
import java.util.Objects;

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



	@Override
	public int hashCode() {
		System.out.println("hashcode()");
		return this.age+this.name.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		Student s=(Student)obj;
		if(s!=null) {
			return s.name==this.name&&s.age==this.age;
		}
		return false;
	}
	
	
}
