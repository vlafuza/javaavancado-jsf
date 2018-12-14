package br.com.allianz.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.allianz.dao.LivrosDao;
import br.com.allianz.models.Livro;

@ManagedBean(name="beanLivro")
@RequestScoped
public class LivrosBean 
{
	private Livro livro;

	public LivrosBean() 
	{
		if(livro == null)
		{
			livro = new Livro();
		}
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public String incluirLivro() 
	{
		try {
			new LivrosDao().incluirLivro(livro);
			return "sucesso";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "erro";
		}
	}
	
	
	public List<Livro> getListaLivros()  throws Exception
	{
		return new LivrosDao().listarLivros();
	}	
}
