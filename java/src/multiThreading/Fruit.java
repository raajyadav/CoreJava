package multiThreading;

public class Fruit extends Thread{
	String name;
	Fruit(){
		
	}
	Fruit(String name){
		this.name=name;
	}
	
	public void run() {
		System.out.println("Thread "+name+" has Started!");
		System.out.println("Details of "+name+" Thread is: "+Thread.currentThread());
		System.out.println("Name of "+name+" Thread is: "+Thread.currentThread().getName());
	}
	
}
