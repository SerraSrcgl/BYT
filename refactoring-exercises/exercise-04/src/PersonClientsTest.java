// The Person class has multiple clients, but all of the clients are in 
// one file for convenience.  Imagine them as non-test methods in separate 
// client classes.

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class PersonClientsTest {

	/*
	 * All client classes was useless because they were doing the same thing, so I did toString() method in Person class
	 *
	 */
	@Test
	public void testPerson() throws IOException {
		Person bobSmith = new Person("Smith", "Bob", null);
		Person jennyJones = new Person("Jones", "Jenny", "J");

		assertEquals("Bob Smith", bobSmith);
		assertEquals("Jenny J Jones", jennyJones);

	}
}
