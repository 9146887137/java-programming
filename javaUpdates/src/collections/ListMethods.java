package collections;

import java.util.Arrays;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,45,23,12,4,90,1,34,67,8,1,23);
		List<Integer> list1=Arrays.asList(23,12,4,90,1,34,67,8,1,23);
		
		//if we create list with Arrays.asList we cant perform any kind of operation like add,remove otherwise we get UnsupportedOperaationException
		//list.add(20);//add element at the last of the list
		//list.add(2, 22);
		System.out.println(list.contains(23));;//check the specific object present inside the given collection
		System.out.println(list.containsAll(list1));;//check all the element of one collection present inside another collection or not
		System.out.println(list.isEmpty());//check list is empty or not
		System.out.println(list.indexOf(34));//find the index of given object
		//System.out.println(list.removeIf((a)->a>20));//remove element according to predicate
		//System.out.println(list.retainAll(list1));//it return only element which is present inside another list other than removed
		System.out.println(list.size());//size of the list
		System.out.println(list.get(1));//find element with the help of index
		System.out.println(list.subList(4, 8));//return the element from given index to another index
		System.out.println(list.stream());//convert pipeline of elements 
	}

}
