package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program5 {

	public static void main(String[] args) {
//		Collect all the Element from stream and store it in collection framework
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(11);
		l1.add(10);
		l1.add(13);
		l1.add(14);
		l1.add(11);
		l1.add(16);
		l1 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		
		
	}
}
