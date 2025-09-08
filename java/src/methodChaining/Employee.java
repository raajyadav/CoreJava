package methodChaining;

public class Employee {
    
	    String name;
	    String id;
	    double salary;
	    int age;
	    
	    public Employee() {
	    	
	    }
	    Employee(String name, String id, double salary, int age){
	    	this.name=name;
	    	this.id=id;
	    	this.salary=salary;
	    	this.age=age;
	    }
	    
	    public Employee getName() {
	    	System.out.println("Name is: "+name);
	     return this;	
	    }
	    public Employee getId() {
	    	System.out.println("Id is: "+id);
	    	return this;
	    }
	    public Employee getSalary() {
	    	System.out.println("Salary is: "+salary);
	    	return this;
	    }
	    public Employee getAge() {
	    	System.out.println("Age is: "+age);
	    	return this;
	    }
	    
}
