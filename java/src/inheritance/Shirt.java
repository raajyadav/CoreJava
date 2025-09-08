package inheritance;

public class Shirt extends Product{
	String size;
	String color;
	
	Shirt(){
		
	}
	Shirt(String name, double price, String brand,String size, String color){
		super(name,price,brand);
		this.size=size;
		this.color=color;
	}
	
	public String getShirtDetails() {
		return super.getProductDetails()+"\nSize is: "+size+"\nColor is: "+color+"\n============================";
	}

}
