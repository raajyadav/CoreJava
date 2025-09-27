package raceConditionMultiThreadingThreadLocal;

public class Counter {

	ThreadLocal<Integer> tl = ThreadLocal.withInitial(()->0);
	
	public void increment() {
		tl.set(tl.get()+1);
	}
	
	public int getCount() {
		return tl.get();
	}
	
	public void clear() {
		tl.remove();
	}
}
