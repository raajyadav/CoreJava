package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Program25 {
	
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(12);
		c1.add(20);
		c1.add(2);
		c1.add(15);
		Collection<Integer> c2 = new ArrayList<>();
		c2.add(12);
		c2.add(20);

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
