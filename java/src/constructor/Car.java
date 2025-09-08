package constructor;

public class Car {

	int x;
	static int count=0;
	
	public Car() {
		count++;
		System.out.println("This is Car Constructor");
	}
	public static void test() {
		System.out.println("This is test method");
	}
	public void drive() {
		System.out.println("This is drive method");
	}
}
