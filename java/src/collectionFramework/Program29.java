package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Program29 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(12);l1.add(23);l1.add(33);l1.add(40);
		System.out.println(l1);
		l1=l1.reversed();
		//List<Integer> l2=l1.reversed();
		System.out.println(l1);
		
		
		
	}

}