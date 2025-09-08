package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Program17 {
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(11);
		l1.add(14);
		l1.add(15);
		l1.add(17);
		
		System.out.println(l1);
		System.out.println("===================================");
		
		for(Integer n:l1) {
			if(n % 2 == 1)
				l1.remove(n);  //Exception in thread "main" java.util.ConcurrentModificationException
		}
		System.out.println(l1);
	}

}
