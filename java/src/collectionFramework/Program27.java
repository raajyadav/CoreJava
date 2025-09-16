package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Program27 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(12);
		c1.add(20);
		c1.add(34);
		c1.add(15);
		
		System.out.println(c1);
		Integer [] p = c1.toArray(new Integer[0]);
		
		for(Integer x:p) {
			System.out.println(x+10);
		}
		System.out.println("======================");
	}
}
