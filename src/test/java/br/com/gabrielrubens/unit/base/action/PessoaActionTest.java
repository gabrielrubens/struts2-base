package br.com.gabrielrubens.unit.base.action;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.gabrielrubens.base.action.PessoaAction;
import br.com.gabrielrubens.base.dao.PessoaDao;
import br.com.gabrielrubens.base.model.Pessoa;

public class PessoaActionTest {
	
	@Mock
	private PessoaDao dao;
	private PessoaAction pessoaAction;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		pessoaAction = new PessoaAction(dao);
	}
	
	@Test
	public void deveTrazerAListaDePessoas(){
		Mockito.when(dao.getPessoas()).thenReturn(Arrays.asList(new Pessoa()));
		String retorno = pessoaAction.index();
		
		Assert.assertEquals("ok", retorno);
	}
}
