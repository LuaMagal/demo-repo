package entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UsuarioTest {

	@Test
	public void instaciaUsuarioTest() {
		Usuario levi = new Usuario();
	}

	@Test
	public void instaciaUsuarioString() {
		Usuario levi = new Usuario("Levi");
	}

	@Test
	public void usuarioGetSetTest() {
		Usuario levi = new Usuario();
		levi.setNome("Levi");
		assertEquals("Levi", levi.getNome());
	}
	
	public void assertivasTest(){
			assertTrue(true);
			assertFalse(false);
			Usuario levi1 = new Usuario();
			Usuario levi2 = levi1;
		    Usuario levi3 = new Usuario();
			assertSame(levi1, levi2);
			assertNotSame(levi1, levi3);
			assertNotEquals(1, 2);
	}

}
