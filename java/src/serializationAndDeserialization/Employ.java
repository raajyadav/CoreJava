package serializationAndDeserialization;

import java.io.Serializable;


public class Employ implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	String name;
	String uid;
	transient String pwd;
	int age;
	double salary;
	
	Employ(){
		
	}
	Employ(String name, String uid, String pwd, int age, double salary){
		this.name=name;
		this.uid=uid;
		this.pwd=pwd;
		this.age=age;
		this.salary=salary;
	}
	
	public String getDetails() {
		return "Name: "+name+"\tUID: "+uid+"\tPWD: "+pwd+"\tAge: "+age+"\tSalary: "+salary;
	}

}
