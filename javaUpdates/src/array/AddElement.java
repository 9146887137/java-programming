package array;

import java.util.Arrays;

public class AddElement {

	public static void main(String[] args) {
		
		int[]a= {10,20,30,40,60,78,34,12};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(addElement(50, 4, a)));
		System.out.println(Arrays.toString(remove(2, addElement(50, 4, a))));
	}
	
	public static int[] addElement(int n,int index,int[]a) {
		int[] ans=new int[a.length+1];
		for(int i=0,j=0;i<ans.length;i++) {
			if(i==index) {
				ans[index]=n; //{10,20,30,40,50}
			}
			else {
				ans[i]=a[j++];
			}
		}
		return ans;

	}
	public static int[] remove(int index,int[]a) {
		
		int[]ans=new int[a.length-1];
		for(int i=0,j=0;i<a.length;i++) {
			if(i!=index) {
				ans[j++]=a[i];
			}
		}
		return ans;
	}

}
