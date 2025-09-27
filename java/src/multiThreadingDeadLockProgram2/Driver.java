package multiThreadingDeadLockProgram2;

public class Driver {

	public static void main(String[] args) {
		String r1 = "Book", r2 = "Pen";
		
//		 DeadLock occur here because r1 need r2 and r2 need r1
	    User u1 = new User("Mohan", r1, r2);
	    User u2 = new User("Sohan",r2 ,r1);
	    
	    u1.start();
	    u2.start();
	}
}
