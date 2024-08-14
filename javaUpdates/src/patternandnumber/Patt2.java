package patternandnumber;

public class Patt2 {

	public static void main(String[] args) {
		
		int n=10;
		int space=n/2;
		int star=0;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<space;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<=star;k++) {
				System.out.print("*   ");
			}
			
			if(i<n/2) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			System.out.println();
		}
	}
}
