package methodOverloading;

public class Program3 {
	
	void test(String x) {
		System.out.println("string method");
	}
	void test(Object x) {
		System.out.println("object method");
	}

	public static void main(String[] args) {
		 Program3 p = new Program3();
		 p.test("abc");
	}
}
