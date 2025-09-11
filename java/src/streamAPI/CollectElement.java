package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectElement {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(13);
		l1.add(11);
		l1.add(10);
		
		l1 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println("List is: "+l1);
	}
}
