package comparableProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployDriver {

	public static void main(String[] args) {
		Employ e1 = new Employ("Mohan", 124, 25000.3);
		List<Employ> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(new Employ("Raj",123,23000.3));
		l1.add(new Employ("Kishan",122, 26000.5));
		l1.add(new Employ("Nitesh", 121, 24000.77));
		l1.add(new Employ("Bambam", 120, 50000.9));
		System.out.println("===============All Employs are====================");
		for(Employ e:l1) {
			System.out.println(e);
		}
//		System.out.println("===============All Employs sorted based on ID===============");
//		Collections.sort(l1);
//		for(Employ e:l1) {
//			System.out.println(e);
//		}
//		System.out.println("===============All Employs sorted based on Salary===============");
//		Collections.sort(l1);
//		for(Employ e:l1) {
//			System.out.println(e);
//		}
		System.out.println("===============All Employs sorted based on Name===============");
		Collections.sort(l1);
		for(Employ e:l1) {
			System.out.println(e);
		}
	}
}
