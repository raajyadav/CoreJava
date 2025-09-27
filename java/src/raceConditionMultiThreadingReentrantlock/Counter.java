package raceConditionMultiThreadingReentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	Lock l = new ReentrantLock();
	private volatile int count = 0;

	public void increment() {
		l.lock();
		try {
			count++;
		} finally {
			l.unlock();
		}

	}
	
	public int getCount() {
		return count;
	}
}
