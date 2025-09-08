package collectionFramework;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Program3 {
	
	public static void main(String[] args) {
		Collection<Integer> c1 = new LinkedHashSet<>(); // It return only unique value
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(20);
		c1.add(12);
		System.out.println(c1);
	}

}
