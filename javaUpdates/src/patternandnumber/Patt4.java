package patternandnumber;

public class Patt4 {

	public static void main(String[] args) {
		
			int num=10;
			int space=0;
			int star=num/2;
			for (int i = 0; i <= num; i++) {
				
				for(int j=0;j<space;j++) {
					System.out.print("  ");
				}
				for(int k=star;k>=0;k--) {
					System.out.print(" *  ");
				}
				if(i<num/2) {
					space++;
					star--;
				}
				else {
					star++;
					space--;
				}
				System.out.println();
			}
		}
}
