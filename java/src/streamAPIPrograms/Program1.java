package streamAPIPrograms;
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Program1 {
	
     public static void main(String[] args) {
		int[] a = {12, 30, 23, 12, 37, 40, 55}; 
		
		Arrays.stream(a).forEach(n->System.out.print(n+" "));
		System.out.println("\n=====================================");
		Arrays.stream(a).filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		System.out.println("\n===========================================");
		int sum = Arrays.stream(a).sum();
		System.out.println("Sum is "+sum);
		System.out.println("================================");
	    IntStream  x   = Arrays.stream(a).distinct();
	    x.forEach(n->System.out.print(n+" "));
	    System.out.println("\n================================");
		Arrays.stream(a).distinct().forEach(n->System.out.print(n+" "));
		int p =(int)Arrays.stream(a).distinct().count();
		System.out.println("\nTotal unique number are: "+p);
		System.out.println("=============================================");
		Arrays.stream(a).sorted().forEach(n->System.out.print(n+" "));
		System.out.println("\n=========================================");
		Arrays.stream(a).skip(5).forEach(n->System.out.print(n+" "));
	}
	
}
