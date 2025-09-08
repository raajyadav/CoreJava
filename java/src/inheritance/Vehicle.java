package inheritance;

public class Vehicle {
	String type;
	double amount;
	double  roi;
	
	Vehicle(){
		
	}
    Vehicle(String type, double amount, double roi){
    	this.type=type;
    	this.amount=amount;
    	this.roi=roi;
    	
    }
    public String getVehicleDetails() {
    	return "Type is: "+type+"\nAmount is: "+amount+"\nRate of Interest is: "+roi+"\n"; 
    }

}
