package collections;

import java.util.Arrays;

public class MyOwnUniqueList implements MyList{

	private Object[] ele= {};
	private int size;
	
	public boolean addToList(Object element) {
		return add(element);
	}
	private boolean add(Object element) {
		 if (size == ele.length) {
	           if(checkDuplicate(element)) {
	        	   ele = grow();
	   	        ele[size] = element;
	   	    // System.out.println(Arrays.toString(ele));
		        size = size + 1;
		        return true;
	           }
		}
		 return false;
	}
	private Object[] grow() {
		return copy(size+1);
	}
	private Object[]copy(int size){
		return ele=Arrays.copyOf(ele,size );
	}
	private boolean checkDuplicate(Object e) {
		for(int i=0;i<ele.length;i++) {
			if(e.equals(ele[i])) {
				return false;
			}
		}
		return true;
	}
	@Override
	public String toString() {
		return Arrays.toString(ele);
	}
	public boolean removeFromList(Object element) {
		return remove(element);
	}
	public boolean remove(Object element) {
		Object[]ar=new Object[ele.length-1];
		boolean status=false;
		for(int i=0,j=0;i<ele.length;i++) { 
			if(ele[i]==element) {
				i++;
				status=true;
				size=size-1;
			}
				ar[j++]=ele[i];
			//System.out.println(Arrays.toString(ar));
		}
		ele=status?ar:ele;
		return status;
	}
}
