package multithreading;

class ClassRoom{
	synchronized public void teach(String teacher) {
		 //synchronized (ClassRoom.class) { //this is synchronized method we pass the class name which i 
			 //want to make it as synchronized after that only one thread can access at a time.
			 
			 /*we can achieve synchronization using two ways
			  * 1)synchronized keyword
			  * 2)synchronized method block
			  * */
			 for(int i=1;i<=10;i++) {
					System.out.println(i+" : "+teacher);
				}
				System.out.println("---------------------");
		//}
	}
}
class Teacher extends Thread{
	ClassRoom room;
	String name;
	
	public Teacher(ClassRoom room, String name) {
		this.room = room;
		this.name = name;
	}
	@Override
	public void run() {
		room.teach(name);
	}
	
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		
		ClassRoom room=new ClassRoom();
		Teacher t1=new Teacher(room, "Rajiv");
		Teacher t2=new Teacher(room, "Vitthal");
		Teacher t3=new Teacher(room, "Abhijeet");
		Teacher t4=new Teacher(room, "Sumit");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
