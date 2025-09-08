package singletonPatternWithEagerInitilization;

public class Printer {
	private static Printer p = new Printer();
	
	private Printer() {
		
	}
	public static Printer getInstance() {
		return p;
	}

}
