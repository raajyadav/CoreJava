package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program18 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(16);
		l1.add(17);
		l1.add(18);
		
		System.out.println("Before: "+l1);
		
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext()) {
			int x = itr.next();
			 if(x % 2 == 1)
				 itr.remove();
		}
		System.out.println("After: "+l1);
		
	}
}
