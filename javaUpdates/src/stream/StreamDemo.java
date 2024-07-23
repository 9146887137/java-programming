package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(10,11,45,79,9,6,5,3,6,8,9);
		//list.stream().forEach((ele)->System.out.println(ele));  //using for each method print the stream
				//Optional<Integer> optional=list.stream().findFirst();
				//System.out.println(optional.get());
				
				//list.stream().filter((num)->num%2==0).forEach((num->System.out.println(num)));
				
//				List<Integer> odd=list.stream().filter((num)->num%2!=0).collect(Collectors.toList());
//				System.out.println(odd);
				
				//map method
				//list.stream().map(a1->a1%2!=0?a1+1:a1).forEach(a1->System.out.println(a1));	
				//list.stream().filter((a1)->isPrime(a1)).forEach(a1->System.out.println(a1));
				list.stream().sorted().forEach(a1->System.out.println(a1));
	}
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
