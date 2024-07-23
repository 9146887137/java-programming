package exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionDriver{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<String> skill=Arrays.asList("java","spring","hibernate","html","css","javascript");
		List<String> degree=Arrays.asList("be","btech");
		List<String> branch=Arrays.asList("cs","it","is");
		
		List<String> myskill=new ArrayList<String>();
		
		System.out.println("Check Eligibility...");
		System.out.println("Enter skills here:");
		for(int i=0;i<skill.size();i++) {
			myskill.add(sc.next().toLowerCase());
		}
		
		System.out.println("Enter Degree here: ");
		String deg=sc.next().toLowerCase();
		
		System.out.println("Enter Branch:");
		String br=sc.next().toLowerCase();
		
		System.out.println("Enter Percentage:");
		double per=sc.nextDouble();
		
			checkEligiblity(skill, degree, branch, myskill, deg, br, per);
		
	}
	
	public static void checkEligiblity(List<String> skill,List<String> degree,List<String> branch,List<String> myskill,String deg,String br,
			double per) {
		if(myskill.containsAll(skill)&&degree.contains(deg)&&branch.contains(br)&&per>=65) {
			System.out.println("You are eligible for this requirement...\n you have successfully added.");
			return;
		}
		throw new NotEligibleException("your details has not matched with this req?. your not eligibe.");
	}
}
