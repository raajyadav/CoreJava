package anonymousClassProgram;

public class ProductDriver {
	

	public static void main(String[] args) {
		Product shirt = new Product() {
			public void addToCard() {
				System.out.println("Add Shirt in Cart");
			}
			
			public void buy() {
				System.out.println("Buy Shirt");
			}
		};
		shirt.addToCard();
		shirt.buy();
		
	}

}
