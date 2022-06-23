package com.br.pdv.app.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque{
	private List<Produtos>listaProdutos = new ArrayList<Produtos>();
	
	public List<Produtos> addProduto(Produtos produtos){
		listaProdutos.add(produtos);
		return listaProdutos;
	}
	public List<Produtos> removeProduto(Produtos produtos){
		listaProdutos.remove(produtos);
		return listaProdutos;
	}
	
	public List<Produtos> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produtos> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	@Override
	public String toString() {
		return "Estoque = \n" + listaProdutos;
	}
	
	
	
	
}
