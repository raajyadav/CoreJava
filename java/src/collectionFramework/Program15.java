package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;


public class Program15 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(15);
		
		System.out.println(c1);
		c1.remove(10);
		c1.remove(100);
		System.out.println(c1);
		
	}
}
