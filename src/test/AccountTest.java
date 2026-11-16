package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fisa_de2_java.model.CurrentAccount;

public class AccountTest {

	@Test
	public void testCreditCurrentAccountOK() {
		
		CurrentAccount a1 = new CurrentAccount(1L, 100.0, 100.0);
		
		Assertions.assertTrue(a1.checkCredit(50.0));
		
		a1.credit(50.0);
		
		Assertions.assertEquals(150.0, a1.getBalance());
	}
	
	@Test
	public void testWithdrawCurrentAccountOK() {
		
		CurrentAccount a1 = new CurrentAccount(1L, 100.0, 100.0);
		
		Assertions.assertTrue(a1.checkWithdraw(50.0));
		
		a1.withdraw(50.0);
		
		Assertions.assertEquals(50.0, a1.getBalance());
	}
	
	@Test
	public void testWithdrawCurrentAccountOKWithDecouvert() {
		
		CurrentAccount a1 = new CurrentAccount(1L, 100.0, 100.0);
		
		Assertions.assertTrue(a1.checkWithdraw(150.0));
		
		a1.withdraw(150.0);
		
		Assertions.assertEquals(-50.0, a1.getBalance());
	}
	
	@Test
	public void testWithdrawCurrentAccountNotOKWithDecouvert() {
		
		CurrentAccount a1 = new CurrentAccount(1L, 100.0, 100.0);
		
		Assertions.assertFalse(a1.checkWithdraw(250.0));
		
		a1.withdraw(250.0);
		
		Assertions.assertEquals(100.0, a1.getBalance());
	}
}
