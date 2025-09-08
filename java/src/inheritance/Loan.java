package inheritance;

public class Loan {
	
	String loan_num;
	double amount;
	double roi;
	
	Loan(){
		
	}
	
	Loan(String loan_num, double amount, double roi){
		this.loan_num=loan_num;
		this.amount = amount;
		this.roi=roi;
	}
	
	public String getLoanDetails() {
		return "Loan Number is : "+loan_num+"\nAmount is : "+amount+"\nRate of Intrest is :"+roi+"\n";
	}

}
