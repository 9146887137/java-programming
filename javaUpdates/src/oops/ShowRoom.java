package oops;

public final class ShowRoom  extends Villager{
	
	/*
	 * i have one object called Showroom
	 * i represent real world object 
	 * thats why we use some non static variables here which hold the information about object
	 * 
	 * the memory alloacated for this variables object created inside heap area*/
	
	//Encapsulation:
	//we achive here data hiding process we call it as encapsulation
	//we make all the members as private 
	/*
	 * private members cannot accessible outside the class but we dont want provide direct access
	 * that why we maked it as private
	 * after i want to provide indirect access
	 * so we use getters and setters according to accessibility
	 */
	private String name;
	private String location;
	private int pincode;
	private String owner;
	
	/*
	 * this is called has a relationship
	 * has a relationship means its association between two or more objects where one object is dependent on another object
	 * now look at this blueprint where Showroom is depend on Bike object
	 * 
	 * in this way we can achieve has a relationship
	 * we create one dependency object reference variable inside dependent object
	 * and we can achieve this design in two way early binding and lazy binding
	 * 
	 * early binding means the reference of dependency object must be created at the time of dependent object instance is created.'
	 * we can achieve this design with the help of non-static initializers.
	 * 
	 * lazy binding means the reference of dependency object not created at the time of dependent object instance created.
	 * we can create instance of dependent object whenever we want with the help of helper method.
	 */
	private Bike bike;
	

	public ShowRoom() {
		// TODO Auto-generated constructor stub
	}

/*
 * this is parameterized constructor
 * the constructor with formal arguments we called it as Parameterized constructor
 * the main work of constructor is load all the non static member and put inside the object memory
 * and also initialize the value inside the object members with its default value.
 * constructor is member which help me to create instance of class
 * 
 * if we failed to add any constructor inside blueprint compiler add default constructor
 * but we successfully add parameterized constructor there so compiler cannot add default costructor
 * 
 * no argument and default are different
 * */
	public ShowRoom(String name, String location, int pincode, String owner) {
		//super();
		/*
		 * this is a keyword and non static reference variable which hold the current object reference which is currently under execution
		 * we can use it inside non-static block,non static method and constructor
		 * constructor also object member which help me to load all the object members inside heap memory */
		this.name = name;
		this.location = location;
		this.pincode = pincode;
		this.owner = owner;
	}
	
	
	
	
	/*
	 * we can overload the constructor if customizly initialize the value inside object member
	 * suppose 1 st bike have 3 features
	 * 2nd bike 4 features
	 * 3rd bike 5 features
	 * some are with 2 features
	 * 
	 *in this way we can overload the constructor
	 * */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "ShowRoom [name=" + name + ", location=" + location + ", pincode=" + pincode + ", owner=" + owner
				+ ", bike=" + bike + "]";
	}
	
	
	
	
	

}
