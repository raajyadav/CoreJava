package collectionFramework;

import java.util.ArrayList;

public class Program21 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(17);
		
		System.out.println("Before Remove: "+l1);
		for(Integer i:l1) {
			if(i % 2 == 0) {
				l1.remove(i);
			}
		}
		System.out.println("After Remove: "+l1); //java.util.ConcurrentModificationException
	}
}
