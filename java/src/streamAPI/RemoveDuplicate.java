package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(10);l1.add(13);l1.add(17);l1.add(16);l1.add(24);
		l1.add(19);l1.add(13);l1.add(16);
	
		System.out.println("Before : "+l1);
		l1=l1.stream().distinct().collect(Collectors.toList());
		//OR
		List<Integer> l2=l1.stream().distinct().collect(Collectors.toList());
		
		System.out.println("After : "+l1);
		System.out.println("List2 is: "+l2);
	
	}

}