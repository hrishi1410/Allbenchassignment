package com.cg.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountQues3_UnitTest {
    
	@Test
	void test() {
		BankAccount_Ques3 acc1=new BankAccount_Ques3(40000.0);
		
		assertThrows(Exception.class,()->acc1.withDraw(21000.0));
	}
}
