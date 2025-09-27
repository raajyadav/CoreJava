package multiThreadingDeadLockProgram;

public class Driver {

	public static void main(String[] args) {
		String r1 = "Book", r2 = "Pen";
		User u1 = new User("Mohan", r1, r2);
	    User u2 = new User("Sohan", r1, r2);
	    
	    u1.start();
	    u2.start();
	}
}
