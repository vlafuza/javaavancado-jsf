package br.com.allianz.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro 
{
	private int id;
	private String titulo;
	private String autor;
	private Date dataPublicacao;
	private double preco;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setDataString(String data) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.setDataPublicacao(df.parse(data));	
		} catch (Exception e) {
			this.setDataPublicacao(new Date());
		}
	}
	
}
