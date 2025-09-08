package VariableShadowing;

public class Vehicle {
	
	static int x = 12;
	
//	In case of Static variable
	public static void test() {
		System.out.println("This is test method");
		int x = 14;
		System.out.println(x);
		System.out.println(Vehicle.x);
		
	}
	
	public static void main(String[] args) {
		test();
		
	}

}
