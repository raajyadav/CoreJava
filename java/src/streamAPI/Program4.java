package streamAPI;

import java.util.ArrayList;

public class Program4 {
	
	public static void main(String[] args) {
		//Through Stream print all the Element of collection in sorted manner
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(11);
		l1.add(10);
		l1.add(13);
		l1.add(11);
		l1.add(15);
		l1.add(16);
		
		l1.stream().sorted().forEach(n->System.out.println(n+" "));
	}

}
