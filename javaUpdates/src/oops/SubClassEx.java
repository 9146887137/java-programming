package oops;

public class SubClassEx extends ObjectCreation{

	int a;
	
	{
		System.out.println(super.a);//super is keyword which is used to refer to super class members basically we use it at time of if a both parent and child class
		//have a same name of members because when we call with member name the priority gives to subclass but i want to refer super class member so we use super keyword
		
	}
	public SubClassEx() {
		super.display();
	}
	
	public void display() {
		System.out.println("from sub class");
	}

}
