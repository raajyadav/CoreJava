package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class Program10 {

	public static void main(String[] args) {
//		For a given List of String print length of each String 

		List<String> l1 = new ArrayList<>();

		l1.add("Raj");
		l1.add("Mohan");
		l1.add("raju");
		
		l1.stream().map(n->n.length()).forEach(n->System.out.print(n+" "));
	}

}
