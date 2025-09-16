package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Program28 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(12);l1.add(23);l1.add(33);l1.add(40);
		System.out.println("Before Remove: "+l1);
//		l1.stream().filter(n->n%2==0).forEach(n->System.out.println(n+" "));
		System.out.println("========================");
		l1.removeIf(n->n>20);
		System.out.println("After Remove: "+l1);
	}
}
