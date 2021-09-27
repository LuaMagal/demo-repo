package servicos;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;

import entidades.Conta;
import entidades.Usuario;
import utils.APIConnection;
import utils.DatabaseConnection;

public class SaqueTest {
	

	@Test
	public void testRealizaSaque() {
		
		APIConnection ConsultaSPCMock = Mockito.mock(APIConnection.class);
		DatabaseConnection insertContaMock = Mockito.mock(DatabaseConnection.class) ;
		
		Usuario leviUsuario = new Usuario("Levi");		
		Conta contalevi = new Conta();
		contalevi.setUsuario(leviUsuario);
		contalevi.setAgencia("123456");
		contalevi.setSaldo(1000.00);
		
		Saque saqueLevi = new Saque();
		
		saqueLevi.setApiConection(ConsultaSPCMock);
		saqueLevi.setDataBaseConnection(insertContaMock);
		
		Mockito.when(ConsultaSPCMock.consultaSPC(contalevi.getUsuario().getNome())).thenReturn(true);
		
		saqueLevi.realizaSaque(contalevi, 300.00 );
		
		assertEquals(700, contalevi.getSaldo(), 0.01);
		
		
	}
	
	@Test
	public void testRealizaSaque2() {
		Usuario leviUsuario = new Usuario("Levi");		
		Conta contalevi = new Conta();
		contalevi.setUsuario(leviUsuario);
		contalevi.setAgencia("123456");
		contalevi.setSaldo(1000.00);
		
		Saque saqueLevi = new Saque();
		
		saqueLevi.realizaSaque(contalevi, 1050.00);
		
		assertEquals(1000.00, contalevi.getSaldo(), 0.01);
		
		
	}

}
