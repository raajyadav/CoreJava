package streamAPIPrograms;

public class VehicleDriver1 {
	
	public static void main(String[] args) {
		test(n->System.out.println(n));
		System.out.println("========================================");
		demo(9);
		System.out.println("=========================================");
		 operate("Raj");
		
	}
	public static void test(Vehicle v) {
		System.out.println("This is test method");
		v.drive(12);
	}
	public static void demo(int x) {
		System.out.println("This is demo method");
		System.out.println(x);
	}
	public static void operate(String s) {
		System.out.println("This is Operate method");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}
	

}
