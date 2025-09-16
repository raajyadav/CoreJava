package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Program26 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(12);
		c1.add(20);
		c1.add(2);
		c1.add(15);
		Object [] p =c1.toArray();
		
		for(Object o:p) {
			System.out.println((Integer)o+10);
		}
		System.out.println("=================");
	}
}
