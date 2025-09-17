package collectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Mohan");
		l1.add("John");
		l1.add("Jack");
		l1.add("Sohan");
		l1.add("ManMohan");
		System.out.println("Before Sorting: "+l1);
		Collections.sort(l1);
		System.out.println("After Sorting: "+l1);
	}

}