package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program14 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(12);
		l1.add(18);
		l1.add(15);
        l1.add(20);
		
		System.out.println(l1);
		System.out.println("================================");
		
		Iterator<Integer> itr = l1.iterator();
		itr.next();
		itr.next();
		itr.remove();  //it remove the current data where cursor lies
		System.out.println(l1);
		
	}
}
