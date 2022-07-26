package com.cg.junit;

public class BankAccount_Ques3 {
    
	double accBalance;
	
	public BankAccount_Ques3(double accBalance) {
		super();
		this.accBalance=accBalance;
	}
	
void withDraw(double withDrawAmt) throws Exception {
		
		if(withDrawAmt>accBalance) {
			throw new Exception("InsufficientFundsException");
		}
		accBalance=accBalance-withDrawAmt;
		
		System.out.println("Amount WithDrawn: "+withDrawAmt);
		System.out.println("Available Balance: "+accBalance);
	}
public static void main(String[] args) {
	BankAccount_Ques3 acc1=new BankAccount_Ques3(40000.0);
	try {
		acc1.withDraw(1000.0);
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}

}
