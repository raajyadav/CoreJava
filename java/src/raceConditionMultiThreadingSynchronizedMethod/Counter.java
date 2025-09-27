package raceConditionMultiThreadingSynchronizedMethod;

public class Counter {

	private volatile int count = 0;
	
	//Synchronized method
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
