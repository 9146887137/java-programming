package oops;

import java8updates.Bike;

public class ShowroomDriver {

	public static void main(String[] args) {
		
		ShowRoom room=new ShowRoom();
		room.setName("devashwa honda");
		room.setLocation("jalna");
		room.setOwner("mehta");
		room.setPincode(431501);
		room.setBike(new oops.Bike("shine", "bs6", "honda"));
		
		System.out.println(room);
		
		room.getBike().setName("CB shine");//this method chaining means call one method after another continiously
		//we can achieve this if my method return reference of an object
		
		//ShowRoom s=new Bike();//we cant upcast the bike into showroom because there is no is a relationship between them
		//mean one class derived from another class one is super and another is sub class there
	}

}
