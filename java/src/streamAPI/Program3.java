package streamAPI;

import java.util.ArrayList;

public class Program3 {
	
	public static void main(String[] args) {
		//count all the even element through stream
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		
	 long count = l1.stream().filter(n->n%2 == 0).count();
	System.out.println(count);
	}

}
