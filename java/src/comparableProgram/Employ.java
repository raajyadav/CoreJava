package comparableProgram;

public class Employ implements Comparable<Employ>{

	String name;
	int id ;
	double salary;
	
	Employ(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary= salary;
	}
	
	public String toString() {
		return "Name is: "+name+"\t  ID is: "+id+"\tSalary is: "+salary;
	}
	
//	ID Sorting
//	public int compareTo(Employ e) {
//		return Integer.compare(this.id, e.id);
//	}
	
//	Salary Sorting
//	public int compareTo(Employ e) {
//		return Double.compare(this.salary, e.salary);
//	}
//	
//	Name Salary 
	public int compareTo(Employ e) {
		return this.name.compareToIgnoreCase(e.name);
	}
	
}
