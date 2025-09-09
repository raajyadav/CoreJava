package collectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program24 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		
		ListIterator<Integer> lit = l1.listIterator(l1.size()); 
		
		
		System.out.println("====================================");
		
		while(lit.hasNext())
			System.out.println(lit.next());
		
		while(lit.hasPrevious())
			System.out.println(lit.previous());
	}
}
