package array;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[]a= {12,56,89,90,2,3,4,6,78,234};
		
		int res=serach(a, 2);
		System.out.println(res!=-1?"element found at:"+res+" index":"element not exist");
		
	}
	public static int serach(int[]a,int ele) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				return i;
			}
		}
		return -1;
	}

}
