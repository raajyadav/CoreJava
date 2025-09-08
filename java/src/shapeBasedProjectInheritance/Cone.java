package shapeBasedProjectInheritance;

public class Cone extends ThreeDShape {
	
	double r;
	double h;
	double l;
	
	Cone(){
		
	}
	Cone(double r, double h, double l){
		this.r=r;
		this.h=h;
		this.l=l;
	}
    @Override
	public void getVolume() {
		System.out.println("Volume of Cone is: "+(1/3)*Math.PI*(r*r)*h+" Cu. Unit");
	}
	@Override
	public void getLSA() {
		System.out.println("Lateral Surface Area of Cone is: "+Math.PI*r*l+" Sq. Unit");
	}
	@Override
	public void getTSA() {
		System.out.println("Total Surface Area of Cone is: "+Math.PI*r*(l+r)+" Sq. Unit");
	}
}
