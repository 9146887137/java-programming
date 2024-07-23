package annonymousInnerClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnnonymousInnerClass {

public static void main(String[] args) {
	
	/* with the help of annonymous inner class we can create instance of inteface
	 * and also provide implementtion of interfcae methods without implementing class
	 * */
	Comparator<Student> com=new Comparator<Student>() {
		
		@Override
		public int compare(Student s1, Student s2) {
			//in this method we pass some logic for how to comapre two students
			return s1.percentage>s2.percentage?1:s1.percentage<s2.percentage?-1:0;
		}
	};
	
	List<Student> students=Arrays.asList(new Student("akash", "jalna", 23, 9146887137L, 80),new Student("Ramesh", "mumbai", 21, 9146587137L, 78),new Student("parmeshwar", "pune", 22, 9146885698L, 85),new Student("prabhu", "jalna", 20, 9146887131L, 81),new Student("raghav", "mumbai", 24, 9147887137L, 60));
	//i want to sort the list of student according to there marks
	
	//here we pass comparator reference to sort method of list
	students.sort(com);
	System.out.println(students);
	
}

}
