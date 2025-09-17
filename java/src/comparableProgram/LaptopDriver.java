package comparableProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDriver {

	public static void main(String[] args) {
		List<Laptop> l1 = new ArrayList<>();
		l1.add(new Laptop("Samsung",8,512));
		l1.add(new Laptop("Lenovo",12,1024));
		l1.add(new Laptop("Mac(Apple)",8,256));
		System.out.println("=================All Laptop Available are==================");
		for(Laptop l:l1) {
			System.out.println(l);
		}
		System.out.println("==================All Laptop Sorted on RAM====================");
		Collections.sort(l1);
		for(Laptop l:l1) {
			System.out.println(l);
		}
	}
}
