package shapeBasedProjectInheritance;

public class Sphere extends ThreeDShape{
	
	double r;
	
	Sphere(){
		
	}

	Sphere(double r){
		this.r=r;
	}
	@Override
	public void getVolume() {
		System.out.println("Volume of Sphere is: "+4/3*(Math.PI*r*r*r)+" Cu. Unit");
	}
	@Override
	public void getLSA() {
		System.out.println("Lateral Surface Area of Sphere is: "+4*Math.PI*r*r+" Sq. Unit");
	}
	@Override
	public void getTSA() {
		System.out.println("Total Surface Area of Sphere is: "+4*Math.PI*r*r+" Sq. Unit");
	}
}
