package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Program6 {
	
	public static void main(String[] args) {
		//Remove all the odd elements from the list
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		
	l1 = l1.stream().filter(n-> n%2 == 0).collect(Collectors.toList());
	System.out.println(l1);
	}

}
