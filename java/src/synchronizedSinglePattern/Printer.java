package synchronizedSinglePattern;

public class Printer {

	private static Printer p = null;
	
	private Printer() {
		
	}
	
	public synchronized static Printer getInstance() {
		if (p == null) {
			p = new Printer();
		}
		return p;
	}
	
}
