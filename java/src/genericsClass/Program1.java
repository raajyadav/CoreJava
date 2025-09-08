package genericsClass;

import java.util.*;


public class Program1 {
	
	public static void main(String[] args) {
		Map m;
		Collection<Integer> c1 = new ArrayList<>();
		Collection<String> c2 = new ArrayList<>();
		
		c2.add("Raj");
	
		System.out.println(c2);
		
//		c1.add(new Car);
//		c1.add(new Car);
		
		c1.add(12);
		c1.add(23);
		System.out.println(c1);
//		c1.add(34.3);
//		c1.add("abcd");
		Vehicle v1 = new Car();
	}

}
