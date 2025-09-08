package nonStaticInnerClass;

public class Car {

	int x = 10;
	
	public void test() {
		System.out.println("This is non static inner method of Car");
	}
	
	
	     class Engine {
		     
	    	 int y = 20;
	    	 
	    	 public void start() {
	    		 System.out.println("Engine Start");
	    	 }
	   }
}
