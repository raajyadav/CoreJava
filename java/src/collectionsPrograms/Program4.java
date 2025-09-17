package collectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Mohan");
		l1.add("John");
		l1.add("Jack");
		l1.add("Sohan");
		l1.add("ManMohan");
		System.out.println("Before Sorting: "+l1);
		Collections.sort(l1, (String a, String b) ->a.compareToIgnoreCase(b));
		System.out.println("After Sorting in Ascending: "+l1);
		Collections.sort(l1, (String a, String b)->b.compareToIgnoreCase(a));
		System.out.println("After Sorting in Desscending: "+l1);
		Collections.sort(l1, (a,b)->a.length()-b.length());
		System.out.println("After Sorting in Size: "+l1);
	}
	
}
