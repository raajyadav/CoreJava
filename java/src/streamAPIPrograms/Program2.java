package streamAPIPrograms;
import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(1);c.add(22);c.add(13);c.add(45);c.add(57);c.add(80);
		System.out.println(c);
		System.out.println("=====================================");
		c.forEach(n->System.out.println(n));
		System.out.println("=======================================");
		c.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		System.out.println("==========================================");
		c.stream().sorted().forEach(n-> System.out.print(n+" "));
	}
}
