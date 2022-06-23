package com.br.pdv.app.model;


public abstract class CadastroProduto {
	private String nome;
	private String codigo;
	private long quantidade;
	private String categoria;
	private Double valor;

	public CadastroProduto(String nome, String codigo, long quantidade, String categoria, Double valor) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
