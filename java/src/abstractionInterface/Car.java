package abstractionInterface;

public class Car implements Vehicle,Transport{
	
	@Override
	public void start() {
		System.out.println("Car start");
	}
	@Override
	public void stop() {
		System.out.println("Car stop");
	}
	@Override
	public void load() {
		System.out.println("Car can load goods");
	}
	public void openGate() {
		System.out.println("Open Gate in Car");
	}

}
