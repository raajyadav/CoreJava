package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program7 {
	
	public static void main(String[] args) {
//		Remove all the duplicate from the list
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(11);
		l1.add(10);
		l1.add(13);
		l1.add(11);
		l1.add(15);
		l1.add(16);
		
	  l1  =	l1.stream().distinct().collect(Collectors.toList());
	  System.out.println(l1);
		
	}

}
