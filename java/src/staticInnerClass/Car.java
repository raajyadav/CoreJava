package staticInnerClass;

public class Car {

	static int x = 12;
	
	public static void test() {
		System.out.println("Static test method of Car");
	}
	  
	   static class Engine{
		   
		   static int y = 40;
		   
		   public static void start() {
			   System.out.println("Start Engine");
		   }
	   }
	
}
