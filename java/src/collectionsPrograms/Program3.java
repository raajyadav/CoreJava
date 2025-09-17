package collectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(12);l1.add(9);l1.add(20);l1.add(12);l1.add(20);l1.add(15);
		System.out.println("Before Sorting: "+l1);
		Collections.sort(l1, (a,b)->a-b);
		System.out.println("After Sorting in Ascending: "+l1);
		Collections.sort(l1, (a,b)->b-a);
		System.out.println("After Sorting in Descending: "+l1);
	}
}
