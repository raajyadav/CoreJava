package streamAPI;

import java.util.ArrayList;


public class Program1 {
	
	public static void main(String[] args) {
		//Create a Stream  and print all the Element through it
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		
		l1.stream().forEach(n->System.out.println(n));
	
	}

}
