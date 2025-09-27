package raceConditionMultiThreadingThreadLocal;

public class User extends Thread{

	String name;
	Counter counter;
	int n;
	
	User(String name, Counter counter,int n){
		this.name=name;
		this.counter=counter;
		this.n=n;
	}
	
	public void run() {
		for(int i=1;i<=n;i++)
			counter.increment();
		System.out.println(name+" has completed counting at : "+counter.getCount());
	}
	
}
