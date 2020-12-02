package b_Money;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CurrencyTest {
	Currency SEK, DKK, NOK, EUR;
	
	@Before
	public void setUp() throws Exception {
		/* Setup currencies with exchange rates */
		SEK = new Currency("SEK", 0.15);
		DKK = new Currency("DKK", 0.20);
		EUR = new Currency("EUR", 1.5);
	}



	@Test
	public void testGetName() {
		assertEquals("EUR", EUR.getName());
		assertEquals("DKK", DKK.getName());
		assertEquals("SEK", SEK.getName());

	}


	@Test
	public void testGetRate() {
		assertEquals(0.15, SEK.getRate(), 0);
		assertEquals(0.20, DKK.getRate(), 0);
		assertEquals(1.5, EUR.getRate(), 0);
	}


	@Test
	public void testSetRate() {
		SEK.setRate(0.1);
		assertEquals(0.1, SEK.getRate(), 0);
		EUR.setRate(0.3);
		assertEquals(0.3,EUR.getRate(),0);
		DKK.setRate(0.1);
		assertEquals(0.1,DKK.getRate(),0);
	}


	@Test
	public void testGlobalValue() {

		assertEquals(100 * 0.20, DKK.universalValue(100), 0);
		assertEquals(100 * 1.5, EUR.universalValue(100), 0);
		assertEquals(100 * 0.15, SEK.universalValue(100), 0);

	}


	@Test
	public void testValueInThisCurrency() {
		assertEquals((int)(100 * 1.5 / 0.20), DKK.valueInThisCurrency(100, EUR), 0);

	}

}

