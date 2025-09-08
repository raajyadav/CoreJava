package VariableShadowing;

public class Fruit {
	
//     Both Static or Non-static Variable
	int x = 10;
	static int y = 20;
	
	public static void test() {
		System.out.println("This is Static test method");
		int y = 30;
		System.out.println(y);
		System.out.println(Fruit.y);
	}
	
	public void demo() {
		System.out.println("This is Non-Static Demo Method");
		int x = 40;
		System.out.println(x);
		System.out.println(this.x);
		
	}
	
	public static void main(String[] args) {
		test();
		Fruit f1 = new Fruit();
		f1.demo();
		
	}
}
