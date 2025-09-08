package genericsClass;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		List <Integer> l1 = new ArrayList<>();
		l1.add(29);
		l1.add(30);
		System.out.println(l1.get(0));
		System.out.println(l1.get(1));
		
		System.out.println(l1.get(0) + l1.get(1));
	}
}
