package collectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployDriver {

	public static void main(String[] args) {
		Employ e1 = new Employ("Mohan", 124, 23333.3) ;
		
		List<Employ> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(new Employ("Sohan", 123 , 23400.9));
		l1.add(new Employ("Rohan", 124, 33456.7));
		l1.add(new Employ("Jhon", 126, 28456.7));
		l1.add(new Employ("Roshan", 120, 25456.7));
		System.out.println("==========All Employs are============");
		for(Employ e:l1) {
			System.out.println(e);
		}
	
		System.out.println("==========All Employs Sorted on Salary============");
		Collections.sort(l1, (a, b)->(int)(a.salary-b.salary));
		for(Employ e:l1) {
			System.out.println(e);
		}
	
		System.out.println("==========All Employs Sorted on Name============");
		Collections.sort(l1, (a, b)->a.name.compareToIgnoreCase(b.name));
		for(Employ e:l1)
			System.out.println(e);
		
		System.out.println("==========All Employs Sorted on Id============");
		Collections.sort(l1, (a, b)->(a.id-b.id));
		for(Employ e:l1) {
			System.out.println(e);
		}
		
	}
}
