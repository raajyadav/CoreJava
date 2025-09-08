package VariableShadowing;

public class Car {

	int p = 30;
	
//   In case of Non-static Variable	
	public void demo() {
		System.out.println("This is demo method");
		int p = 40;
		System.out.println(p);
		System.out.println(this.p);
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.demo();
//		System.out.println(this.p);
	}
}
