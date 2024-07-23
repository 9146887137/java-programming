package lamda;

import java.util.Comparator;

public class Student /*implements Comparable<Student>*/ /*implements Comparator<Student>*/{
	
	String name;
	int age;
	double marks;
	

	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int age, double marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
//	@Override
//	public int compareTo(Student o) {
//		return this.age>o.age?1:this.age<o.age?-1:0;
//	}
	
//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.age>o2.age?1:o1.age<o2.age?-1:0;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
	
	

}
