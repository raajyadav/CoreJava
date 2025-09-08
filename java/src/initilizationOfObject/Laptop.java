package initilizationOfObject;


public class Laptop {

	  String name;
	  String model;
	  double price;
	  
	  public void setDetails(String name, String model,double price) {
		  this.name=name;
		  this.model=model;
		  this.price=price;
	  }
	  public String getDetails() {
		  return "Name is: "+name+"\nModel is : "+model+"\nPrice is : "+price+"\n=================================";
	  }
	
}

	
	


