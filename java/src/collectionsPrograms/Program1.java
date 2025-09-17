package collectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(12);l1.add(9);l1.add(20);l1.add(12);l1.add(20);l1.add(15);
		System.out.println("Before Sorting: "+l1);
		Collections.sort(l1);
		System.out.println("After Sorting: "+l1);
	}
}
