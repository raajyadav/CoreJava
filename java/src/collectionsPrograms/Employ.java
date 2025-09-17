package collectionsPrograms;

public class Employ {

	String name;
	int id;
	double salary;
	
	Employ(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String toString() {
		return "Name is: "+name+"\tID is: "+id+"\tSalary is: "+salary;
	}
}
