package com.br.pdv.app.model;

public class Produtos extends CadastroProduto{
	
	public Produtos(String nome, String codigo, long quantidade, String categoria, Double valor) {
		super(nome, codigo, quantidade, categoria, valor);
	}

	@Override
	public String toString() {
		return "Produto:\n" 
				+ "nome = " + this.getNome() + ","
				+ " codigo = " + this.getCodigo() +
				", quantidade = " + this.getQuantidade() +
				", categoria = " + this.getCategoria() + 
				", valor = " + this.getValor();
	}
	
	
}
