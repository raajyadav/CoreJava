package methodOverriding;

 class Car extends Vehicle{

	 public void start() {
		 super.start();
		 System.out.println("start 2");
	 }
	public void openGate() {
		System.out.println("Open Gate in Car");
	}
}
