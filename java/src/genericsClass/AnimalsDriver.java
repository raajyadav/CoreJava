package genericsClass;
import java.util.*;

public class AnimalsDriver {
	
		public static void main(String[] args) {
			List<LivingThings> l1 = new ArrayList<>();
			l1.add(new LivingThings());
			l1.add(new Animals());
			l1.add(new Dog());
			l1.add(new Pug());
			
			List<Animals> l2 = new ArrayList<>();
			l2.add(new Animals());
			
			List<Dog> l3 = new ArrayList<>();
			List<Pug> l4 = new ArrayList<>();
			
			System.out.println("==========================================");
			test(l1);
			test(l2);
			test(l3);
			test(l4);
			
			System.out.println("=====================================");
			barks(l3);
			barks(l4);
		
			
			System.out.println("========================================");
			eat(l1);
			eat(l2);
			eat(l3);
			
	    }
		//UnboundedType --->It will allow any type of Collection
		public static void test(Collection<?> c) {
			System.out.println("test method");
		}
		
		//UpperBoundType --->It will allow only Dog or its Child Type
		public static void barks(Collection<? extends Dog> c) {
			System.out.println("barks method");
		}
		
		//LowerBoundType --->It will allow only Dog or its Parent Type
		public static void eat(Collection<?  super Dog> c) {
			System.out.println("eat method");
		}

}
