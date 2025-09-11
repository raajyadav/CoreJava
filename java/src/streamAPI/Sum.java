package streamAPI;

import java.util.ArrayList;
import java.util.List;


public class Sum {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(10);l1.add(13);l1.add(17);l1.add(16);l1.add(24);
		l1.add(19);l1.add(13);l1.add(16);
	
		int sum=l1.stream().mapToInt(n->n).sum();
		
		
		System.out.println("sum : "+sum);
	}

}