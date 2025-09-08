package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Program1 {
	
	public static void main(String[] args) {
		
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(12);
		c1.add(20);
		c1.add(20);
		c1.add(22);
		System.out.println(c1);
	}

}
