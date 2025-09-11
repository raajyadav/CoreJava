package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveOdd {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(10);l1.add(13);l1.add(17);l1.add(16);l1.add(24);
		l1.add(19);l1.add(13);l1.add(16);
	
		System.out.println("Before : "+l1);
		l1=l1.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		
		System.out.println("After : "+l1);
	}

}