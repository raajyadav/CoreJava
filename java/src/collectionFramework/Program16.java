package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Program16 {
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(12);
		l1.add(15);
		l1.add(20);
		
		System.out.println(l1);
		System.out.println("=======================================");
		l1.remove((Object)12);
		System.out.println(l1);
		
	}

}
