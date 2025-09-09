package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Program22 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		
		System.out.println("Before Remove: "+l1);
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext()) {
			Integer n =itr.next();
			if(n % 2 == 1) {
				itr.remove();
			}
		}
		System.out.println("After Remove: "+l1);
	}

}
