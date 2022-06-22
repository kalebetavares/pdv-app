package com.br.pdv.app.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CadastroProduto {
	private String nome;
	private String codigo;
	private long quantidade;
	private String categoria;
	private Double valor;
	private List<CadastroProduto> listaProdutos = new ArrayList<CadastroProduto>();
	
	protected CadastroProduto(String nome, String codigo, long quantidade, String categoria, Double valor, List<CadastroProduto> listaProdutos) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.valor = valor;
		this.listaProdutos = listaProdutos;
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
	protected List<CadastroProduto> getListaProdutos() {
		return listaProdutos;
	}
	protected void setListaProdutos(List<CadastroProduto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
}
