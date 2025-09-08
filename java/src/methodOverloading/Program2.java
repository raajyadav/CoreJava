package methodOverloading;

public class Program2 {
	
    void test(int x) {
    	System.out.println("test");
    }
    
    
	
	public static void main(String[] args) {
		Program2 p = new Program2();
		p.test('c');
	}
	
}
