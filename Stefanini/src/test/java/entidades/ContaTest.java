package entidades;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContaTest {
	Conta contaTeste;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		contaTeste = new Conta();
	}

	@After
	public void tearDown() throws Exception {
	} 

	@Test
	public void testGetSetAgencia() {
		contaTeste.setAgencia("12345");
		assertEquals("12345", contaTeste.getAgencia());
		
	}
	
	@Test
	public void testGetSetConta() {
		contaTeste.setConta("1245");
		assertEquals("1245", contaTeste.getConta());
		
	}

}
