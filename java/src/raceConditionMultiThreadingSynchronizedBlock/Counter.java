package raceConditionMultiThreadingSynchronizedBlock;

public class Counter {
	
	private volatile int count=0;
	
	public int getCount() {
		return count;
	}
	
//	Synchronized block
	public void increment() {
		synchronized(this) {
			count++;
		}
	}

}
