package comparableProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShirtDriver {

	public static void main(String[] args) {
		List<Shirt> s1 = new ArrayList<>();
		s1.add(new Shirt("Regal Stitch","Blue", 1000.9));
		s1.add(new Shirt("Luxe Threads", "White", 999.2));
		s1.add(new Shirt("Crown & Color", "Black", 1300));
		System.out.println("===========All Shirt Available are==========");
		for(Shirt s:s1) {
			System.out.println(s);
		}
		System.out.println("=================All Shirt Sorted on Price===================");
		Collections.sort(s1);
		for(Shirt s:s1) {
			System.out.println(s);
		}
	}
}
