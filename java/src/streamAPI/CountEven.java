package streamAPI;

import java.util.ArrayList;

public class CountEven {
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(13);
		l1.add(11);
		l1.add(10);
		int count = (int) l1.stream().filter(n->n%2 == 0).count();
		System.out.println("Total Even Elements are: "+count);
		
	}

}
