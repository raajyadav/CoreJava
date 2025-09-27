package hasArelationShip;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple", new Processor("Jelly Bean"));
		System.out.println("Mobile object is :"+m1);
		System.out.println("Mobile name : "+m1.name);
		m1.vedioCall();
		m1.p.start();
	}
}
