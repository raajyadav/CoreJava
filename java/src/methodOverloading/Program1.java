package methodOverloading;

public class Program1 {
	
	void test(int x) {
		System.out.println("int method");
	}
	void test(int x ,int y) {
		System.out.println("int, int method");
	}
	void test(int x, double y) {
		System.out.println("int double");
	}
	void test(double x,double y) {
		System.out.println("double , double");
	}
	void test(String x, int y) {
		System.out.println("int");
	}
	void test() {
		System.out.println();
	}
	public static void main(int x) {
		System.out.println("main method");
	}

	public static void main(String[] args) {
	  Program1 p = new Program1();
	  p.test();
	  p.test(12);
	  p.test(3,4);
	  p.test(2,6.0);
	  p.test(10.0 ,29.0);
	  p.test("raj",3);
	  p.main(29);
	
	}
}
