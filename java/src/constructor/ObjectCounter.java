package constructor;

public class ObjectCounter {
	static int count=0;
	
	ObjectCounter(){
		count++;
		System.out.println("Counter Object "+count+" is created!!");
	}
	
	public static void main(String[] args) {
		ObjectCounter c1 = new ObjectCounter();
		ObjectCounter c2 = new ObjectCounter();
		ObjectCounter c3 = new ObjectCounter();
		
	}

}
