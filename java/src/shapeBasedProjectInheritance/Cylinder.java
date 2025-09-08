package shapeBasedProjectInheritance;

public class Cylinder extends ThreeDShape {

	double r;
	double h;
	
	Cylinder(){
		
	}
	Cylinder(double r, double h){
		this.r=r;
		this.h=h;
	}
	@Override
	public void getVolume() {
		System.out.println("Volume of Cylinder is: "+Math.PI*r*r*h+" Cu. Unit");
	}
	@Override
	public void getLSA() {
		System.out.println("Lateral Surface Area of Cylinder is: "+2*Math.PI*r*h+" Sq. Unit");
	}
	@Override
	public void getTSA() {
		System.out.println("Total Surface Area of Cylinder is: "+2*Math.PI*r*(r+h)+" Sq. Unit");
	}
}
