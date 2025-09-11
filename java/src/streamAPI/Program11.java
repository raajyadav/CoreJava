package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Program11 {

	public static void main(String[] args) {
//		Print sum and average of all the element  List
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(11);
		l1.add(10);
		l1.add(13);
		l1.add(11);
		l1.add(15);
		l1.add(12);
		
		int sum =l1.stream().mapToInt(n->n).sum();
		System.out.println(sum);
				
		OptionalDouble avg = l1.stream().mapToDouble(n->n).average();
		System.out.println(avg);
		
	}
}
