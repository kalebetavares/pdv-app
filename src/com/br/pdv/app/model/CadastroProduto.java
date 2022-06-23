package com.br.pdv.app.model;


public abstract class CadastroProduto {
	private String nome;
	private String codigo;
	private long quantidade;
	private String categoria;
	private Double valor;

	protected CadastroProduto(String nome, String codigo, long quantidade, String categoria, Double valor) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.valor = valor;
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getCodigo() {
		return codigo;
	}
	protected void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	protected long getQuantidade() {
		return quantidade;
	}
	protected void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}
	protected String getCategoria() {
		return categoria;
	}
	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	protected Double getValor() {
		return valor;
	}
	protected void setValor(Double valor) {
		this.valor = valor;
	}
}
