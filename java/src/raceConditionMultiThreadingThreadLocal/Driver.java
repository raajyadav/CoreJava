package raceConditionMultiThreadingThreadLocal;

public class Driver {
	
	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter();
		
		User u1 = new User("Mohan", c1, 1000);
		User u2 = new User("Sohan" ,c1, 1200);
		User u3 = new User("Rohit", c1, 1500);
				
		u1.start();
		u2.start();
		u3.start();
		
		u1.join();
		u2.join();
		u3.join();
		
		System.out.println("Total count : "+c1.getCount());
	}

}
