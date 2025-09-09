package collectionFramework;

import java.util.ArrayList;

public class Program20 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(16);
		l1.add(17);
		l1.add(18);
		System.out.println("Before Remove: "+l1);
		
		for(int i = 0; i < l1.size();i++) {
			if(l1.get(i) % 2 == 1) {
				l1.remove(l1.get(i)); //Index is used to remove
				i--;
			}
		}
		System.out.println("After Remove: "+l1);
	}
	
}
