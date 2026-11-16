package fisa_de2_java.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fisa_de2_java.model.CreditImpossibleException;
import fisa_de2_java.model.SavingAccount;

public class AccountTest {

	@Test
	public void testCreditSavingAccountOK() {
		
		SavingAccount sa = new SavingAccount(3L, 300.0, 1200.0);
		try {
			sa.credit(200);
			Assertions.assertEquals(500.0, sa.getBalance());
		}
		catch(CreditImpossibleException cie) {
			Assertions.fail();
		}
	}
	
	@Test
	public void testCreditSavingAccountNotOK_checkBalanceIsOKAfter() {
		
		SavingAccount sa = new SavingAccount(3L, 300.0, 1200.0);
		try {
			sa.credit(1000);
			Assertions.fail();
		}
		catch(CreditImpossibleException cie) {
			// all is good
		}
		Assertions.assertEquals(300.0, sa.getBalance());
	}
	
	@Test
	public void testCreditSavingAccountNotOK() {
		
		SavingAccount sa = new SavingAccount(3L, 300.0, 1200.0);
		Assertions.assertThrows(CreditImpossibleException.class, () -> sa.credit(1000));
	}
}
