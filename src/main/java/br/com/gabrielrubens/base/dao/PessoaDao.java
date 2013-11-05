package br.com.gabrielrubens.base.dao;

import java.util.Arrays;
import java.util.List;

import br.com.gabrielrubens.base.model.Pessoa;

public class PessoaDao {

	public List<Pessoa> getPessoas() {
		return Arrays.asList(new Pessoa(), new Pessoa(), new Pessoa());
	}
}