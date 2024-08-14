package strings;

public class ExtendStackFrame {
	public static int count=0;

	public static void main(String[] args) {
		
		System.out.println("hello :"+count++);
		main(new String[10]);
	}
}
