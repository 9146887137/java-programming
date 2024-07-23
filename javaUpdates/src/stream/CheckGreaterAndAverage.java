package stream;

import java.util.Arrays;
import java.util.List;

public class CheckGreaterAndAverage {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,2,3,45,12,67,34,21);
		double sum=list.stream().filter(num->num>10).mapToDouble((a)->a).average().getAsDouble();
		System.out.println(sum);
		int[]a= {10,20,2,3,45,12,67,34,21};
		double avg=Arrays.stream(a).filter((b)->b>10).average().getAsDouble();
		System.out.println(avg);
	}
}
