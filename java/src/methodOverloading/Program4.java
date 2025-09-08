package methodOverloading;

public class Program4 {
	
	void test(StringBuffer x) {
		System.out.println("stringbuffer");
	}
	void test(String x) {
		System.out.println("string");
	}

	public static void main(String[] args) {
		Program4 p = new Program4();
//		p.test("abc");
		p.test(new StringBuffer());
//		p.test(null);
	}
}
