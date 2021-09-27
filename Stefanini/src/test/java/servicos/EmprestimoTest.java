package servicos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import utils.DataUtils;

public class EmprestimoTest {
	
	Emprestimo emprestimo;
	DataUtils dataUtilsMock;
	DataUtils dataUtilsSpy;

	@Before
	public void setUp() throws Exception {
		emprestimo = new Emprestimo();
		dataUtilsMock = Mockito.mock(DataUtils.class);
		dataUtilsSpy = Mockito.spy(DataUtils.class);
	}

	@Test
	public void testAprovaPagamentoMock() {
		Mockito.when(dataUtilsMock.prazoPagamento(10)).thenReturn(60);
		assertEquals(emprestimo.aprovaPagamento(dataUtilsMock, 1), 0);
	}
	
	@Test
	public void testAprovaPagamentoSpy() {
		Mockito.when(dataUtilsSpy.prazoPagamento(10)).thenReturn(60);
		assertEquals(emprestimo.aprovaPagamento(dataUtilsSpy, 1), 11);
	}

}
