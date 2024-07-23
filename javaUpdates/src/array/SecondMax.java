package array;

public class SecondMax {

	public static void main(String[] args) {
		
		int a[]= {10,30,2,345,78,90,34,56,99};
		System.out.println(sMax(a));
		
	}
	public static int sMax(int[]a) {
		int max=0;
		int sMAx=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				sMAx=max;
				max=a[i];
			}
			else if(a[i]>sMAx) {
				sMAx=a[i];
			}
		}
		return sMAx;
	}

}
