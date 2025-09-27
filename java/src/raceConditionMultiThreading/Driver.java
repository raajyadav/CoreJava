package raceConditionMultiThreading;

public class Driver {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter c1 = new Counter();
		
		User u1 = new User("Mohan", c1, 1000);
		User u2 = new User("Sohan", c1, 2000);
		User u3 = new User("Rohit", c1, 3000);
		
		u1.start();
		u2.start();
		u3.start();
		
		u1.join();
		u2.join();
		u3.join();
		
		System.out.println("Final count is : "+c1.getCount());
	}

}
