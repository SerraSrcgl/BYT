package b_Money;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
	Currency SEK, DKK;
	Bank SweBank;
	Account testAccount;
	
	@Before
	public void setUp() throws Exception {
		SEK = new Currency("SEK", 0.15);
		SweBank = new Bank("SweBank", SEK);
		SweBank.openAccount("Alice");
		testAccount = new Account("Hans", SEK);
		testAccount.deposit(new Money(10000000, SEK));

		SweBank.deposit("Alice", new Money(1000000, SEK));
	}

	@Test
	public void AddRemoveTimedPaymentTest() {
		testAccount.addTimedPayment("1", 5, 10, new Money(1000000, SEK), SweBank, "Alice");
		assertTrue(testAccount.timedPaymentExists("1"));
		testAccount.removeTimedPayment("1");
		assertFalse(testAccount.timedPaymentExists("1"));
	}


	@Test
	public void TimedPaymentTest() throws AccountDoesNotExistException {
		testAccount.addTimedPayment("1", 2, 2, new Money(1000000, SEK), SweBank, "Alice");
		System.out.println(testAccount.getBalance().getAmount());
		testAccount.tick();
		testAccount.tick();
		testAccount.tick();

		//assertEquals(new Integer(10000000 - 1000), testAccount.getBalance().getAmount(), 0);
	}


	@Test
	public void AddWithdrawTest() {
		testAccount.deposit(new Money(5000, SEK));
		assertEquals(10000000 + 5000, testAccount.getBalance().getAmount(), 0);
		testAccount.withdraw(new Money(5000, SEK));
		assertEquals(10000000, testAccount.getBalance().getAmount(), 0);

	}

	@Test
	public void GetBalanceTest() {
		assertTrue(new Money(10000000, SEK).equals(testAccount.getBalance()));
	}
}
