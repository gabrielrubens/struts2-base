package br.com.gabrielrubens.base.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@Namespace(value="/")
public class IndexAction {

	@Action(value="/",
			results=@Result(name="ok", location="index/index.jsp"))
	public String index(){
		return "error";
	}
}
