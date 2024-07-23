package array;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[]a= {10,40,36,7,7,36,40,10};
		int i=0,j=a.length-1;
		while(i<j) {
			if(a[i++]!=a[j--]) {
				break;
			}
		}
		
		System.out.println(j==i?"palinrom array":"not palindrom array");
	}

}
