package singletonPatternWithLazyInitilization;

public class Driver {

	public static void main(String[] args) {
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		Printer p3 = Printer.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
