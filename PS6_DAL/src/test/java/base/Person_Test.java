package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {
	
	private static PersonDomainModel per;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
		
		@Test
		public void Perstest() {
			per.setFirstName("Mandy");
			per.setLastName("Martin");
			per.setCity("Hockessin");
			per.setPostalCode(19707);
			per.setStreet("452 Parkridge Drive");
		}
		@Test
		public void Addperson() {
			PersonDAL.addPerson(per);
		}
		
		@Test
		public void Getperson() {
			String LastName = per.getLastName();
			assertEquals("Martin",LastName);
		}
		
		@Test
		public void Deleteperson() {
			UUID perID = null;
			PersonDAL.deletePerson(perID);
		}

		@Test
		public void Updateperson() {
			per.setLastName("Martin");
			PersonDAL.updatePerson(per);
		}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}

}

