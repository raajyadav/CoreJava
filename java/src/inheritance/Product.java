package inheritance;

public class Product {
	String name;
	double price;
    String brand;
    
    Product(){
    	
    }
    Product(String name, double price,String brand ){
    	this.name=name;
    	this.price=price;
    	this.brand=brand;
    }
    
    public String getProductDetails() {
    	return "Name is: "+name+"\nPrice is: "+price+"\nBrand is: "+brand;
    }
}
