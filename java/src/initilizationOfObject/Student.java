package initilizationOfObject;

public class Student {

	String name;
	int  rollNo;
	String branch;
	
	public void setDetails(String name, int rollNo, String branch) {
		this.name=name;
		this.rollNo=rollNo;
		this.branch=branch;
	}
	
	public String getDetails() {
		return "Name is: "+name+"\nRoll No is: "+rollNo+"\nBranch is: "+branch+"\n===========================";
	}
}
