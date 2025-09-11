package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class LegthSum {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Raj");
		l1.add("Roshan");
		l1.add("Raju");
		
		int sum = l1.stream().mapToInt(n->n.length()).sum();
		System.out.println("Total characters : "+sum);
	}
}
