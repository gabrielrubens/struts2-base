package br.com.gabrielrubens.base.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import br.com.gabrielrubens.base.dao.PessoaDao;
import br.com.gabrielrubens.base.model.Pessoa;

@Namespace(value="/pessoa")
public class PessoaAction {
	private PessoaDao dao;
	private List<Pessoa> pessoas;
	
	public PessoaAction(PessoaDao dao) {
		this.dao = dao;
	}
	
	@Action(value="/",
			results=@Result(name="ok", location="pessoa/lista.jsp"))
	public String index(){
		this.pessoas = dao.getPessoas();
		return "ok";
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
}
